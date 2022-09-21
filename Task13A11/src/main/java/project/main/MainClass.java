package project.main;

import project.dao.GalaxyDAO;
import project.dao.PlanetDAO;
import project.entity.Galaxy;
import project.entity.Planet;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        PlanetDAO planetDAO  = new PlanetDAO();
        planetDAO.getPlanetsWithLifeAndTheirSatellites(1);

        List<Planet> planetList = planetDAO.getPlanetsByRadiusAndCountSatellite();
        System.out.println(planetList);

        Planet planet = planetDAO.getPlanetsByCountVolumeSatellite();
        System.out.println(planet);

        GalaxyDAO galaxyDAO = new GalaxyDAO();
        Galaxy galaxy = galaxyDAO.getGalaxyByCoreTemperature();
        System.out.println(galaxy);
    }
}
