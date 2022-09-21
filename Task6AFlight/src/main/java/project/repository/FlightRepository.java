package project.repository;

import project.entity.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    List<Flight> flightList = new ArrayList<>();

    public List<Flight> getFlightList() {
        return flightList;
    }
}
