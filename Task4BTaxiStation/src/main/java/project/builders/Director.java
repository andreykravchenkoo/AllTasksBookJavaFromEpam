package project.builders;

import project.etity.Car;

public class Director {
    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car createCar() {
        return builder.createCar();
    }
}
