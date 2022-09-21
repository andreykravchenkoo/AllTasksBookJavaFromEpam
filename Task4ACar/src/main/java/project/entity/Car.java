package project.entity;

import java.util.Objects;

public class Car extends Vehicle {
    private String model;
    private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private Wheel rearLeftWheel;
    private Wheel rearRightWheel;

    public Car(Engine engine, int fuelQuantity, String model, Wheel frontLeftWheel, Wheel frontRightWheel, Wheel rearLeftWheel, Wheel rearRightWheel) {
        super(engine, fuelQuantity);
        this.model = model;
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.rearLeftWheel = rearLeftWheel;
        this.rearRightWheel = rearRightWheel;
    }
    public Car(int fuelQuantity, String model, Wheel frontLeftWheel, Wheel frontRightWheel, Wheel rearLeftWheel, Wheel rearRightWheel) {
        super(fuelQuantity);
        this.model = model;
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.rearLeftWheel = rearLeftWheel;
        this.rearRightWheel = rearRightWheel;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getFrontLeftWheel() {
        return frontLeftWheel;
    }

    public void setFrontLeftWheel(Wheel frontLeftWheel) {
        this.frontLeftWheel = frontLeftWheel;
    }

    public Wheel getFrontRightWheel() {
        return frontRightWheel;
    }

    public void setFrontRightWheel(Wheel frontRightWheel) {
        this.frontRightWheel = frontRightWheel;
    }

    public Wheel getRearLeftWheel() {
        return rearLeftWheel;
    }

    public void setRearLeftWheel(Wheel rearLeftWheel) {
        this.rearLeftWheel = rearLeftWheel;
    }

    public Wheel getRearRightWheel() {
        return rearRightWheel;
    }

    public void setRearRightWheel(Wheel rearRightWheel) {
        this.rearRightWheel = rearRightWheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(frontLeftWheel, car.frontLeftWheel) && Objects.equals(frontRightWheel, car.frontRightWheel) && Objects.equals(rearLeftWheel, car.rearLeftWheel) && Objects.equals(rearRightWheel, car.rearRightWheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, frontLeftWheel, frontRightWheel, rearLeftWheel, rearRightWheel);
    }

    @Override
    public String toString() {
        return "Car{ " + "model= " + model + ", " + getEngine() + ", fuelQuantity= " + getFuelQuantity() + ", frontLeftWheel= " + frontLeftWheel + ", frontRightWheel= " + frontRightWheel + ", rearLeftWheel= " + rearLeftWheel + ", rearRightWheel= " + rearRightWheel + " }";
    }
}
