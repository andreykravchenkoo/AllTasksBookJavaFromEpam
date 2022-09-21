package project.entity;

import java.util.Objects;

public class Airplane {
    private String model;
    private int price;
    private int spaciousness;
    private int loadCapacity;
    private int rangeOfFlight;
    private int fuelConsumption;
    AirplaneType airplaneType;

    public Airplane(String model, int price, int spaciousness, int loadCapacity, int rangeOfFlight, int fuelConsumption, AirplaneType airplaneType) {
        this.model = model;
        this.price = price;
        this.spaciousness = spaciousness;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
        this.airplaneType = airplaneType;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getSpaciousness() {
        return spaciousness;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return price == airplane.price && spaciousness == airplane.spaciousness && loadCapacity == airplane.loadCapacity && rangeOfFlight == airplane.rangeOfFlight && fuelConsumption == airplane.fuelConsumption && Objects.equals(model, airplane.model) && airplaneType == airplane.airplaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, spaciousness, loadCapacity, rangeOfFlight, fuelConsumption, airplaneType);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", spaciousness=" + spaciousness +
                ", loadCapacity=" + loadCapacity +
                ", rangeOfFlight=" + rangeOfFlight +
                ", fuelConsumption=" + fuelConsumption +
                ", airplaneType=" + airplaneType +
                '}';
    }
}
