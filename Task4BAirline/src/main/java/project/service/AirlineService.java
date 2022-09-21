package project.service;

import project.entity.Airline;
import project.entity.Airplane;

import java.util.Collections;
import java.util.Comparator;

public class AirlineService {

    public void sumSpaciousness(Airline airline) {
        int sum = airline.getAirlineRepository().airplaneList.stream().map(Airplane::getSpaciousness).reduce(0, Integer::sum);

        System.out.println("Sum of spaciousness: " + sum);
    }

    public void sumLoadCapacity(Airline airline) {
        int sum = airline.getAirlineRepository().airplaneList.stream().map(Airplane::getLoadCapacity).reduce(0, Integer::sum);

        System.out.println("Sum of load of capacity: " + sum);
    }

    public void sortCompany(Airline airline) {
        Collections.sort(airline.getAirlineRepository().airplaneList, new Comparator<Airplane>() {
            @Override
            public int compare(Airplane o1, Airplane o2) {
                return o1.getRangeOfFlight() - o2.getRangeOfFlight();
            }
        });
    }

    public void fuelConsumptionRange(int from, int to, Airline airline) {
        for (Airplane airplane: airline.getAirlineRepository().airplaneList) {
            if (airplane.getFuelConsumption() > from && airplane.getFuelConsumption() < to) {
                System.out.println("Airplane range: " + airplane);
            }
        }
    }
}
