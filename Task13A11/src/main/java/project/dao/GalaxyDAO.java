package project.dao;

import project.connector.ConnectionCreator;
import project.entity.Galaxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GalaxyDAO {

    public Galaxy getGalaxyByCoreTemperature() {
        Galaxy galaxy = null;
        final String SQL_GET_GALAXY_BY_CORE_TEMPERATURE = "SELECT galaxy.id, galaxy.name, SUM(planet.core_temperature) FROM galaxy\n" +
                "JOIN planet ON planet.galaxy_id = galaxy.id\n" +
                "GROUP BY galaxy.id\n" +
                "ORDER BY SUM(planet.core_temperature) DESC LIMIT 1";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_GALAXY_BY_CORE_TEMPERATURE)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                galaxy = getGalaxy(resultSet);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return galaxy;
    }

    private Galaxy getGalaxy(ResultSet resultSet) {
        Galaxy galaxy = new Galaxy();

        try {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            galaxy.setId(id);
            galaxy.setName(name);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return galaxy;
    }
}
