package project.etity;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int price;
    private int fuelСonsumption;
    private int speed;
    private Roominess roominess;

    public Car(String brand, String model, int price, int fuelСonsumption, int speed, Roominess roominess) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelСonsumption = fuelСonsumption;
        this.speed = speed;
        this.roominess = roominess;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public Roominess getRoominess() {
        return roominess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && fuelСonsumption == car.fuelСonsumption && speed == car.speed && brand.equals(car.brand) && model.equals(car.model) && roominess == car.roominess;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, fuelСonsumption, speed, roominess);
    }

    @Override
    public String toString() {
        return "Car{ " + "brand= " + brand + ", model= " + model + ", price= " + price +
                ", fuelСonsumption= " + fuelСonsumption + ", speed= " + speed + ", roominess= " + roominess + " }";
    }
}
