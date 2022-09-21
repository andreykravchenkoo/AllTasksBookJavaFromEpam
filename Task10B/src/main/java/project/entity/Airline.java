package project.entity;

import project.repository.AirlineRepository;

import java.util.List;
import java.util.Objects;

public class Airline {
    private String name;
    private String location;
    private AirlineRepository airlineRepository;

    public Airline(String name, String location, AirlineRepository airlineRepository) {
        this.name = name;
        this.location = location;
        this.airlineRepository = airlineRepository;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public AirlineRepository getAirlineRepository() {
        return airlineRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.equals(location, airline.location) && Objects.equals(airlineRepository, airline.airlineRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, airlineRepository);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", airlineRepository=" + airlineRepository +
                '}';
    }
}
