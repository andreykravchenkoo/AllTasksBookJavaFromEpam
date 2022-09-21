package project.entity;

import java.util.Objects;

public abstract class Vehicle {
    private Engine engine;
    private int fuelQuantity;

    public Vehicle(Engine engine, int fuelQuantity) {
        this.engine = engine;
        this.fuelQuantity = fuelQuantity;
    }

    public Vehicle(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return fuelQuantity == vehicle.fuelQuantity && Objects.equals(engine, vehicle.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, fuelQuantity);
    }

    @Override
    public String toString() {
        return "Vehicle{ " + "engine= " + engine + ", fuelQuantity= " + fuelQuantity + " }";
    }
}
