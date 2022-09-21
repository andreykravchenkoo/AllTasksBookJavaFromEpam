package project.dao;

import project.entity.Satellite;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SatelliteDAO {

    public static Satellite getSatellite(ResultSet resultSet) {
        Satellite satellite = new Satellite();

        try {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double radius = resultSet.getDouble("radius");
            double distanceToPlanet = resultSet.getDouble("distance_to_planet");
            int idPlanet = resultSet.getInt("planet_id");

            satellite.setId(id);
            satellite.setName(name);
            satellite.setRadius(radius);
            satellite.setDistanceToPlanet(distanceToPlanet);
            satellite.setPlanetId(idPlanet);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return satellite;
    }
}
