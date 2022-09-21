package project.builders;

import project.etity.Car;
import project.etity.Roominess;

public class CarHyundaiBuilder implements CarBuilder {
    @Override
    public Car createCar() {
        return new Car("Hyundai", "Sonata", 10000, 10, 260, Roominess.FOUR);
    }
}
