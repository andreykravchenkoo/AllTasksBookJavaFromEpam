package project.builders;

import project.etity.Car;
import project.etity.Roominess;

public class CarRenoBuilder implements CarBuilder {
    @Override
    public Car createCar() {
        return new Car("Reno", "Logan", 8000, 7, 240, Roominess.FOUR);
    }
}
