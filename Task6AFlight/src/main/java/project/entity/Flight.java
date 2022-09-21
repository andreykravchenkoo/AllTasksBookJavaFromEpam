package project.entity;

import java.util.Objects;

public class Flight {
    private long id;
    private String modelAirplane;
    private String destination;
    private AirplaneStatus airplaneStatus;
    private double averageFlightTime;
    private int curbWeight;
    private int fuelQuantity;
    private boolean value;

    public Flight(long id, String modelAirplane, String destination, AirplaneStatus airplaneStatus, double averageFlightTime, int curbWeight, int fuelQuantity, boolean value) {
        this.id = id;
        this.modelAirplane = modelAirplane;
        this.destination = destination;
        this.airplaneStatus = airplaneStatus;
        this.averageFlightTime = averageFlightTime;
        this.curbWeight = curbWeight;
        this.fuelQuantity = fuelQuantity;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelAirplane() {
        return modelAirplane;
    }

    public void setModelAirplane(String modelAirplane) {
        this.modelAirplane = modelAirplane;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public AirplaneStatus getAirplaneStatus() {
        return airplaneStatus;
    }

    public void setAirplaneStatus(AirplaneStatus airplaneStatus) {
        this.airplaneStatus = airplaneStatus;
    }

    public double getAverageFlightTime() {
        return averageFlightTime;
    }

    public void setAverageFlightTime(double averageFlightTime) {
        this.averageFlightTime = averageFlightTime;
    }

    public int getCurbWeight() {
        return curbWeight;
    }

    public void setCurbWeight(int curbWeight) {
        this.curbWeight = curbWeight;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id && Double.compare(flight.averageFlightTime, averageFlightTime) == 0 && curbWeight == flight.curbWeight && fuelQuantity == flight.fuelQuantity && value == flight.value && Objects.equals(modelAirplane, flight.modelAirplane) && Objects.equals(destination, flight.destination) && airplaneStatus == flight.airplaneStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelAirplane, destination, airplaneStatus, averageFlightTime, curbWeight, fuelQuantity, value);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", modelAirplane='" + modelAirplane + '\'' +
                ", destination='" + destination + '\'' +
                ", airplaneStatus=" + airplaneStatus +
                ", averageFlightTime=" + averageFlightTime +
                ", curbWeight=" + curbWeight +
                ", fuelQuantity=" + fuelQuantity +
                ", value=" + value +
                '}';
    }
}
