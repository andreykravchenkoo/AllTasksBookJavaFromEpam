package project.dao;

import com.sun.jdi.event.StepEvent;
import project.connector.ConnectionCreator;
import project.entity.Actor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorDaoImpl implements VideoLibraryDao {
    private static final String SQL_ADD_ACTOR = "INSERT INTO actor_info (id, name, date_of_birthday) VALUES (?,?,?)";
    private static final String SQL_GET_ALL_ACTOR_INFO = "SELECT * FROM actor_info";
    private static final String SQL_GET_ACTOR_BY_ID = "SELECT * FROM actor_info WHERE id = (?)";
    private static final String SQL_UPDATE_ACTOR = "UPDATE actor_info SET name = (?), date_of_birthday = (?) WHERE id = (?)";
    private static final String SQL_DELETE_ACTOR = "DELETE FROM actor_info WHERE id = (?)";
    private static final String SQL_GET_ACTOR_INFO_FROM_MOVIE = "SELECT * FROM actor_info WHERE actor_info.name = (SELECT video_library.actor FROM video_library WHERE movie = (?))";

    @Override
    public boolean create(Object entity) {
        boolean flag;
        Actor actor = (Actor) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_ADD_ACTOR);

            preparedStatement.setInt(1, actor.getId());
            preparedStatement.setString(2, actor.getName());
            preparedStatement.setString(3, actor.getDateOfBirthday());
            preparedStatement.execute();

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

    @Override
    public List findAll() {
        List<Actor> actorList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionCreator.createConnection();
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL_ACTOR_INFO);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirthday = resultSet.getString("date_of_birthday");
                actorList.add(new Actor(id, name, dateOfBirthday));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
          close(connection);
          close(statement);
        }
        return actorList;
    }

    @Override
    public Object findById(Object id) {
        Actor actor = new Actor();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_ACTOR_BY_ID);
            preparedStatement.setInt(1, (Integer) id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idActor = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirthday = resultSet.getString("date_of_birthday");
                actor.setId(idActor);
                actor.setName(name);
                actor.setDateOfBirthday(dateOfBirthday);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return actor;
    }

    @Override
    public Object update(Object entity) {
        Actor actor = (Actor) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE_ACTOR);

            preparedStatement.setInt(3, actor.getId());
            preparedStatement.setString(1, actor.getName());
            preparedStatement.setString(2, actor.getDateOfBirthday());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return actor;
    }

    @Override
    public boolean delete(Object id) {
        boolean flag;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE_ACTOR);

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

    public Actor getActorInfoFromMovie(String movie) {
        Actor actor = new Actor();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_ACTOR_INFO_FROM_MOVIE);
            preparedStatement.setString(1, movie);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirthday = resultSet.getString("date_of_birthday");
                actor.setId(id);
                actor.setName(name);
                actor.setDateOfBirthday(dateOfBirthday);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return actor;
    }
}
