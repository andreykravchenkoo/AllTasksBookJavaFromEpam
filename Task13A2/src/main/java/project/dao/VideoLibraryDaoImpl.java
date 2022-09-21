package project.dao;

import project.connector.ConnectionCreator;
import project.entity.Movie;
import project.entity.VideoLibrary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VideoLibraryDaoImpl implements VideoLibraryDao {
    private static final String SQL_ADD_VIDEO_LIBRARY = "INSERT INTO video_library (movie, actor, producer) VALUES (?,?,?)";
    private static final String SQL_GET_ALL_VIDEO_LIBRARY = "SELECT * FROM video_library";
    private static final String SQL_GET_VIDEO_LIBRARY_BY_ID = "SELECT * FROM video_library WHERE id = (?)";
    private static final String SQL_UPDATE_VIDEO_LIBRARY = "UPDATE video_library SET movie = (?), actor = (?), producer = (?) WHERE id = (?)";
    private static final String SQL_DELETE_VIDEO_LIBRARY = "DELETE FROM video_library WHERE id = (?)";

    @Override
    public boolean create(Object entity) {
        boolean flag;
        VideoLibrary videoLibrary = (VideoLibrary) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_ADD_VIDEO_LIBRARY);

            preparedStatement.setString(1, videoLibrary.getMovie());
            preparedStatement.setString(2, videoLibrary.getActor());
            preparedStatement.setString(3, videoLibrary.getProducer());
            preparedStatement.execute();

            flag = true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            flag = false;
        } finally {
            close(preparedStatement);
            close(connection);
        }

        return flag;
    }

    @Override
    public List findAll() {
        List<VideoLibrary> videoLibraries = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionCreator.createConnection();
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL_VIDEO_LIBRARY);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String movie = resultSet.getString("movie");
                String actor = resultSet.getString("actor");
                String producer = resultSet.getString("producer");
                videoLibraries.add(new VideoLibrary(id, movie, actor, producer));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(statement);
        }

        return videoLibraries;
    }

    @Override
    public Object findById(Object id) {
        VideoLibrary videoLibrary = new VideoLibrary();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_VIDEO_LIBRARY_BY_ID);
            preparedStatement.setInt(1, (Integer) id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String movie = resultSet.getString("movie");
                String actor = resultSet.getString("actor");
                String producer = resultSet.getString("producer");
                videoLibrary.setMovie(movie);
                videoLibrary.setActor(actor);
                videoLibrary.setProducer(producer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return videoLibrary;
    }

    @Override
    public Object update(Object entity) {
        VideoLibrary videoLibrary = (VideoLibrary) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE_VIDEO_LIBRARY);

            preparedStatement.setInt(4, videoLibrary.getId());
            preparedStatement.setString(1, videoLibrary.getMovie());
            preparedStatement.setString(2, videoLibrary.getActor());
            preparedStatement.setString(3, videoLibrary.getProducer());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return videoLibrary;
    }

    @Override
    public boolean delete(Object id) {
        boolean flag;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE_VIDEO_LIBRARY);

            preparedStatement.setInt(1, (Integer) id);
            preparedStatement.executeUpdate();
            flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            flag = false;
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return flag;
    }
}
