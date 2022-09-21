package project.dao;

import project.connector.ConnectionCreator;
import project.entity.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProducerDaoImpl implements VideoLibraryDao {
    private static final String SQL_ADD_PRODUCER = "INSERT INTO producer_info (id, name, date_of_birthday) VALUES (?,?,?)";
    private static final String SQL_GET_ALL_PRODUCER_INFO = "SELECT * FROM producer_info";
    private static final String SQL_GET_PRODUCER_BY_ID = "SELECT * FROM producer_info WHERE id = (?)";
    private static final String SQL_UPDATE_PRODUCER = "UPDATE producer_info SET name = (?), date_of_birthday = (?) WHERE id = (?)";
    private static final String SQL_DELETE_PRODUCER = "DELETE FROM producer_info WHERE id = (?)";
    private static final String SQL_GET_ACTOR_WHO_ARE_PRODUCER = "SELECT * FROM producer_info, video_library WHERE producer_info.name = video_library.actor";

    @Override
    public boolean create(Object entity) {
        boolean flag;
        Producer producer = (Producer) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_ADD_PRODUCER);

            preparedStatement.setInt(1, producer.getId());
            preparedStatement.setString(2, producer.getName());
            preparedStatement.setString(3, producer.getDateOfBirthday());
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
        List<Producer> producerList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionCreator.createConnection();
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL_PRODUCER_INFO);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirthday = resultSet.getString("date_of_birthday");
                producerList.add(new Producer(id, name, dateOfBirthday));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(statement);
        }

        return producerList;
    }

    @Override
    public Object findById(Object id) {
        Producer producer = new Producer();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_PRODUCER_BY_ID);
            preparedStatement.setInt(1, (Integer) id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idProducer = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirthday = resultSet.getString("date_of_birthday");
                producer.setId(idProducer);
                producer.setName(name);
                producer.setDateOfBirthday(dateOfBirthday);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return producer;
    }

    @Override
    public Object update(Object entity) {
        Producer producer = (Producer) entity;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE_PRODUCER);

            preparedStatement.setInt(3, producer.getId());
            preparedStatement.setString(1, producer.getName());
            preparedStatement.setString(2, producer.getDateOfBirthday());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return producer;
    }

    @Override
    public boolean delete(Object id) {
        boolean flag;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE_PRODUCER);

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
        return false;
    }

    public List<Producer> getActorWhoAreProducer() {
        List<Producer> producerList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_ACTOR_WHO_ARE_PRODUCER);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirthday = resultSet.getString("date_of_birthday");
                producerList.add(new Producer(id, name, dateOfBirthday));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            close(connection);
            close(preparedStatement);
        }
        return producerList;
    }
}
