package project.dao;

import project.connector.ConnectionCreator;
import project.entity.Planet;
import project.entity.Satellite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlanetDAO {

    public void getPlanetsWithLifeAndTheirSatellites(int idGalaxy) {
        List<Planet> planetList = new ArrayList<>();
        List<Satellite> satelliteList = new ArrayList<>();

        final String SQL_GET_PLANET = "SELECT planet.id, planet.name, planet.radius, planet.core_temperature, \n" +
                "planet.presence_atmosphere,planet.presence_life, planet.presence_life, \n" +
                "planet.galaxy_id\n" +
                "FROM planet \n" +
                "JOIN galaxy ON galaxy.id = planet.galaxy_id WHERE planet.presence_life = true\n" +
                "AND galaxy.id = (?)";
        final String SQL_GET_SATELLITE = "SELECT satellite.id, \n" +
                "satellite.name, satellite.radius, satellite.distance_to_planet, \n" +
                "satellite.planet_id \n" +
                "FROM planet \n" +
                "JOIN satellite ON planet.id = satellite.planet_id\n" +
                "JOIN galaxy ON galaxy.id = planet.galaxy_id WHERE planet.presence_life = true\n" +
                "AND galaxy.id = (?)";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatementPlanet = connection.prepareStatement(SQL_GET_PLANET);
             PreparedStatement preparedStatementSatellite = connection.prepareStatement(SQL_GET_SATELLITE)) {

            preparedStatementPlanet.setInt(1, idGalaxy);
            ResultSet resultSetPlanet = preparedStatementPlanet.executeQuery();

            while (resultSetPlanet.next()) {
                planetList.add(getPlanet(resultSetPlanet));
            }

            preparedStatementSatellite.setInt(1, idGalaxy);
            ResultSet resultSetSatellite = preparedStatementSatellite.executeQuery();

            while (resultSetSatellite.next()) {
                satelliteList.add(SatelliteDAO.getSatellite(resultSetSatellite));
            }

            System.out.println("Task 1: ");
            System.out.println(planetList);
            System.out.println(satelliteList);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Planet> getPlanetsByRadiusAndCountSatellite() {
        List<Planet> planetList = new ArrayList<>();
        final String SQL_GET_PlANET_BY_RADIUS_COUNT = "SELECT planet.id, planet.name, planet.radius, planet.core_temperature, \n" +
                "planet.presence_atmosphere, planet.presence_life, planet.galaxy_id,\n" +
                "COUNT(satellite.planet_id) FROM planet \n" +
                "JOIN satellite \n" +
                "ON satellite.planet_id = planet.id\n" +
                "GROUP BY planet.id\n" +
                "ORDER BY planet.radius, COUNT(satellite.planet_id)\n";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_PlANET_BY_RADIUS_COUNT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                planetList.add(getPlanet(resultSet));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return planetList;
    }

    public Planet getPlanetsByCountVolumeSatellite() {
        Planet planet = null;
        final String SQL_GET_PLANET_BY_COUNT_VOLUME_SATELLITE = "SELECT planet.id, planet.name, planet.radius, planet.core_temperature, \n" +
                "planet.presence_atmosphere, planet.presence_life, planet.galaxy_id,\n" +
                "SUM(4/3 * 3.14 * satellite.radius * satellite.radius * satellite.radius),\n" +
                "COUNT(satellite.planet_id)\n" +
                "FROM planet \n" +
                "JOIN satellite \n" +
                "ON satellite.planet_id = planet.id\n" +
                "GROUP BY planet.id\n" +
                "ORDER BY SUM(4/3 * 3.14 * satellite.radius * satellite.radius * satellite.radius), \n" +
                "COUNT(satellite.planet_id) ASC\n" +
                "LIMIT 1";

        try (Connection connection = ConnectionCreator.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_PLANET_BY_COUNT_VOLUME_SATELLITE)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                planet = getPlanet(resultSet);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return planet;
    }

    private Planet getPlanet(ResultSet resultSet) {
        Planet planet = new Planet();

        try {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double radius = resultSet.getDouble("radius");
            double coreTemperature = resultSet.getDouble("core_temperature");
            boolean presenceAtmosphere = resultSet.getBoolean("presence_atmosphere");
            boolean presenceLife = resultSet.getBoolean("presence_life");
            int galaxyId = resultSet.getInt("galaxy_id");

            planet.setId(id);
            planet.setName(name);
            planet.setRadius(radius);
            planet.setCoreTemperature(coreTemperature);
            planet.setPresenceAtmosphere(presenceAtmosphere);
            planet.setPresenceLife(presenceLife);
            planet.setGalaxyId(galaxyId);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return planet;
    }
}
