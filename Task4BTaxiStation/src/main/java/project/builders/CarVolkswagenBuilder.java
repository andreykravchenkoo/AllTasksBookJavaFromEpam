package project.builders;

import project.etity.Car;
import project.etity.Roominess;

public class CarVolkswagenBuilder implements CarBuilder {
    @Override
    public Car createCar() {
        return new Car("Volkswagen", "Transporter", 12000, 15, 200, Roominess.EIGHT);
    }
}
