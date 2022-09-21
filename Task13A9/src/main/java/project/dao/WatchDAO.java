package project.dao;

import project.connector.ConnectionCreator;
import project.entity.Watch;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WatchDAO {

    public boolean save(Watch watch) {
        boolean flag = false;
        final String SQL_SAVE_WATCH = "INSERT INTO watch (brand, type, price, amount, manufacturer_id) VALUES (?,?,?,?,?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE_WATCH)) {

            preparedStatement.setString(1, watch.getBrand());
            preparedStatement.setString(2, watch.getType());
            preparedStatement.setInt(3, watch.getPrice());
            preparedStatement.setInt(4, watch.getAmount());
            preparedStatement.setInt(5, watch.getManufacturerId());
            preparedStatement.execute();

            flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }

    public List<Watch> findAll() {
        List<Watch> watchList = new ArrayList<>();
        final String SQL_FIND_ALL = "SELECT * FROM watch";

        try (Connection connection = ConnectionCreator.createConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SQL_FIND_ALL);

            while (resultSet.next()) {
                watchList.add(getWatch(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return watchList;
    }

    public Optional<Watch> findById(int id) {
        Watch watch;
        final String SQL_FIND_BY_ID = "SELECT * FROM watch WHERE id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_BY_ID)) {

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                watch = getWatch(resultSet);
                return Optional.ofNullable(watch);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return Optional.empty();
    }

    public Watch update(Watch watch) {
        final String SQL_UPDATE_WATCH = "UPDATE watch SET brand = (?), type = (?), price = (?), amount = (?), manufacturer_id = (?) WHERE id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_WATCH)) {

            preparedStatement.setInt(6, watch.getId());
            preparedStatement.setString(1, watch.getBrand());
            preparedStatement.setString(2, watch.getType());
            preparedStatement.setInt(3, watch.getPrice());
            preparedStatement.setInt(4, watch.getAmount());
            preparedStatement.setInt(5, watch.getManufacturerId());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return watch;
    }

    public boolean delete(int id) {
        boolean flag = false;
        final String SQL_DELETE_WATCH = "DELETE FROM watch WHERE id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_WATCH)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }

    public List<Watch> findWatchByType(String type) {
        List<Watch> watchList = new ArrayList<>();
        final String SQL_FIND_WATCH_BY_TYPE = "SELECT * FROM watch WHERE type = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_WATCH_BY_TYPE)) {

            preparedStatement.setString(1, type);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                watchList.add(getWatch(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return watchList;
    }

    public List<Watch> findWatchByPriceLimit(int price) {
        List<Watch> watchList = new ArrayList<>();
        final String SQL_FIND_WATCH_BY__PRICE_LIMIT = "SELECT * FROM watch WHERE type = 'Mechanical' AND price < (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_WATCH_BY__PRICE_LIMIT)) {

            preparedStatement.setInt(1, price);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                watchList.add(getWatch(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return watchList;
    }

    public List<Watch> findWatchByCountry(String country) {
        List<Watch> watchList = new ArrayList<>();
        final String SQL_FIND_WATCH_BY_COUNTRY = "SELECT * FROM watch JOIN manufacturer ON watch.manufacturer_id = manufacturer.id AND manufacturer.country = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_WATCH_BY_COUNTRY)) {

            preparedStatement.setString(1, country);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                watchList.add(getWatch(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return watchList;
    }

    public int findAllPrice() {
        int allPrice = 0;
        final String SQL_FIND_ALL_PRICE_FUNCTION = "CALL find_all_price(?)";

        try (Connection connection = ConnectionCreator.createConnection();
             CallableStatement callableStatement = connection.prepareCall(SQL_FIND_ALL_PRICE_FUNCTION)) {

            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();

            allPrice = callableStatement.getInt(1);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allPrice;
    }

    public boolean transactionTest(Watch watchFirst, Watch watchSecond)  {
        boolean flag = false;
        final String SQL_UPDATE_1 = "INSERT INTO watch (brand, type, price, amount, manufacturer_id) VALUES (?,?,?,?,?)";
        final String SQL_UPDATE_2 = "INSERT INTO watch (brandd, type, price, amount, manufacturer_id) VALUES (?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;

        try {
            connection = ConnectionCreator.createConnection();
            preparedStatement1 = connection.prepareStatement(SQL_UPDATE_1);
            preparedStatement2 = connection.prepareStatement(SQL_UPDATE_2);

            connection.setAutoCommit(false);

            preparedStatement1.setString(1, watchFirst.getBrand());
            preparedStatement1.setString(2, watchFirst.getType());
            preparedStatement1.setInt(3, watchFirst.getPrice());
            preparedStatement1.setInt(4, watchFirst.getAmount());
            preparedStatement1.setInt(5, watchFirst.getManufacturerId());
            preparedStatement1.execute();

            preparedStatement2.setString(1, watchSecond.getBrand());
            preparedStatement2.setString(2, watchSecond.getType());
            preparedStatement2.setInt(3, watchSecond.getPrice());
            preparedStatement2.setInt(4, watchSecond.getAmount());
            preparedStatement2.setInt(5, watchSecond.getManufacturerId());
            preparedStatement2.execute();

            connection.commit();

            flag = true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                connection.setAutoCommit(true);
                connection.close();
                preparedStatement1.close();
                preparedStatement2.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return flag;
    }

    private Watch getWatch(ResultSet resultSet) {
        Watch watch = new Watch();

        try {
            int id = resultSet.getInt("id");
            String brand = resultSet.getString("brand");
            String type = resultSet.getString("type");
            int price = resultSet.getInt("price");
            int amount = resultSet.getInt("amount");
            int manufacturerId = resultSet.getInt("manufacturer_id");

            watch.setId(id);
            watch.setBrand(brand);
            watch.setType(type);
            watch.setPrice(price);
            watch.setAmount(amount);
            watch.setManufacturerId(manufacturerId);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return watch;
    }
}
