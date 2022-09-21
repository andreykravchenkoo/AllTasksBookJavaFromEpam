package project.dao;

import project.connector.ConnectionCreator;
import project.entity.Manufacturer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManufacturerDAO {

    public boolean save(Manufacturer manufacturer) {
        boolean flag = false;
        final String SQL_ADD_WATCH = "INSERT INTO manufacturer (title, country) VALUES (?,?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_ADD_WATCH)) {

            preparedStatement.setString(1, manufacturer.getTitle());
            preparedStatement.setString(2, manufacturer.getCountry());
            preparedStatement.execute();

            flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }

    public List<Manufacturer> findAll() {
        List<Manufacturer> manufacturerList = new ArrayList<>();
        final String SQL_FIND_ALL = "SELECT * FROM manufacturer";

        try (Connection connection = ConnectionCreator.createConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SQL_FIND_ALL);

            while (resultSet.next()) {
                manufacturerList.add(getManufacturer(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return manufacturerList;
    }

    public Optional<Manufacturer> findById(int id) {
        Manufacturer manufacturer;
        final String SQL_FIND_BY_ID = "SELECT * FROM manufacturer WHERE id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_BY_ID)) {

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                manufacturer = getManufacturer(resultSet);
                return Optional.ofNullable(manufacturer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return Optional.empty();
    }

    public Manufacturer update(Manufacturer manufacturer) {
        final String SQL_UPDATE_MANUFACTURER = "UPDATE manufacturer SET title = (?), country = (?) WhERE id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_MANUFACTURER)) {

            preparedStatement.setInt(3, manufacturer.getId());
            preparedStatement.setString(1, manufacturer.getTitle());
            preparedStatement.setString(2, manufacturer.getCountry());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return manufacturer;
    }

    public boolean delete(int id) {
        boolean flag = false;
        final String SQL_DELETE_MANUFACTURER = "DELETE FROM manufacturer WHERE id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_MANUFACTURER)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }

    public List<Manufacturer> findManufacturerByAmountWatch(int maxAmount) {
        List<Manufacturer> manufacturerList = new ArrayList<>();
        final String SQL_FIND_MANUFACTURER_BY_AMOUNT_WATCH = "SELECT m.id, m.title, m.country FROM manufacturer m LEFT JOIN watch w ON w.manufacturer_id = m.id GROUP BY m.id, m.title, m.country HAVING SUM(w.amount) < (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_MANUFACTURER_BY_AMOUNT_WATCH)) {

            preparedStatement.setInt(1, maxAmount);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                manufacturerList.add(getManufacturer(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return manufacturerList;
    }

    public int findCountCountry(String country) {
        int countCountry = 0;
        final String SQL_FIND_COUNT_COUNTRY_FUNCTION = "SELECT find_count_country(?)";

        try (Connection connection = ConnectionCreator.createConnection();
             CallableStatement callableStatement = connection.prepareCall(SQL_FIND_COUNT_COUNTRY_FUNCTION)) {

            callableStatement.setString(1, country);
            callableStatement.execute();

            countCountry = callableStatement.getInt("find_count_country");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return countCountry;
    }

    private Manufacturer getManufacturer(ResultSet resultSet) {
        Manufacturer manufacturer = new Manufacturer();

        try {
            int id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            String country = resultSet.getString("country");

            manufacturer.setId(id);
            manufacturer.setTitle(title);
            manufacturer.setCountry(country);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return manufacturer;
    }
}
