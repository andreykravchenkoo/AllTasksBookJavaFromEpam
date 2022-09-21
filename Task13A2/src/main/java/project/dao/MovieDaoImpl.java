package project.dao;

import com.sun.jdi.event.StepEvent;
import project.connector.ConnectionCreator;
import project.entity.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements VideoLibraryDao {
    private static final String SQL_ADD_MOVIE = "INSERT INTO movie_info (title, actors, release_date, country) VALUES (?,?,?,?)";
    private static final String SQL_GET_ALL_MOVIE_INFO = "SELECT * FROM movie_info";
    private static final String SQL_GET_MOVIE_BY_ID = "SELECT * FROM movie_info WHERE id = (?)";
    private static final String SQL_UPDATE_MOVIE = "UPDATE movie_info SET title = (?), actors = (?), release_date = (?), country = (?) WHERE id = (?)";
    private static final String SQL_DELETE_MOVIE = "DELETE FROM movie_info WHERE id = (?)";
    private static final String SQL_GET_NEW_MOVIES = "SELECT * FROM movie_info WHERE release_date = (?) OR release_date = (?)";

    @Override
    public boolean create(Object entity) {
        boolean flag;
        Movie movie = (Movie) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_ADD_MOVIE);

            preparedStatement.setString(1, movie.getTitle());
            preparedStatement.setString(2, movie.getActors());
            preparedStatement.setString(3, movie.getReleaseDate());
            preparedStatement.setString(4, movie.getCountry());
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
        List<Movie> movieList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionCreator.createConnection();
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL_MOVIE_INFO);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String actors = resultSet.getString("actors");
                String releaseDate = resultSet.getString("release_date");
                String country = resultSet.getString("country");
                movieList.add(new Movie(id, title, actors, releaseDate, country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(statement);
        }
        return movieList;
    }

    @Override
    public Object findById(Object id) {
        Movie movie = new Movie();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_MOVIE_BY_ID);
            preparedStatement.setInt(1, (Integer) id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idMovie = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String actors = resultSet.getString("actors");
                String releaseDate = resultSet.getString("release_date");
                String country = resultSet.getString("country");
                movie.setId(idMovie);
                movie.setTitle(title);
                movie.setActors(actors);
                movie.setReleaseDate(releaseDate);
                movie.setCountry(country);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return movie;
    }

    @Override
    public Object update(Object entity) {
        Movie movie = (Movie) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE_MOVIE);

            preparedStatement.setInt(5, movie.getId());
            preparedStatement.setString(1, movie.getTitle());
            preparedStatement.setString(2, movie.getActors());
            preparedStatement.setString(3, movie.getReleaseDate());
            preparedStatement.setString(4, movie.getCountry());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return movie;
    }

    @Override
    public boolean delete(Object id) {
        boolean flag;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE_MOVIE);

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

    public List<Movie> getNewMovies(String yearOne,String yearTwo) {
        List<Movie> movieList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_NEW_MOVIES);
            preparedStatement.setString(1, yearOne);
            preparedStatement.setString(2, yearTwo);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String actors = resultSet.getString("actors");
                String releaseDate = resultSet.getString("release_date");
                String country = resultSet.getString("country");
                movieList.add(new Movie(id, title, actors, releaseDate, country));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return movieList;
    }
}
