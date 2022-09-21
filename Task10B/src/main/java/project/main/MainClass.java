package project.main;

import project.connectro.Connector;
import project.entity.Airline;
import project.entity.Airplane;
import project.entity.AirplaneType;
import project.repository.AirlineRepository;
import project.service.AirlineService;

public class MainClass {
    public static void main(String[] args) {
        AirlineService airlineService = new AirlineService();
        Connector connector = new Connector();

        Airplane airplane1 = new Airplane("AH-225", 1000000, 10, 500, 5000, 1000, AirplaneType.CARGO);
        Airplane airplane2 = new Airplane("AH-225", 1000000, 10, 500, 5000, 1000, AirplaneType.CARGO);
        Airplane airplane3 = new Airplane("Boieng-777", 1000000, 450, 200, 4000, 500, AirplaneType.PASSENGER);
        Airplane airplane4 = new Airplane("Boieng-777", 1000000, 400, 150, 3000, 700, AirplaneType.PASSENGER);

        Airline airline = new Airline("wreewr", "erw", new AirlineRepository());

        airline.getAirlineRepository().airplaneList.add(airplane1);
        airline.getAirlineRepository().airplaneList.add(airplane2);
        airline.getAirlineRepository().airplaneList.add(airplane3);
        airline.getAirlineRepository().airplaneList.add(airplane4);

        System.out.println(airline.getAirlineRepository().airplaneList.toString());

        System.out.println("");

        airlineService.sumSpaciousness(airline);

        System.out.println("");

        airlineService.sumLoadCapacity(airline);

        System.out.println("");

        airlineService.sortCompany(airline);

        System.out.println("");

        System.out.println(airline.getAirlineRepository().airplaneList.toString());

        System.out.println("");

        airlineService.fuelConsumptionRange(600, 800, airline);

        connector.writeObject(airplane1);

        Airplane airplane = connector.readObject();

        System.out.println("");

        System.out.println("Serializable airplane: " + airplane);
    }
}
