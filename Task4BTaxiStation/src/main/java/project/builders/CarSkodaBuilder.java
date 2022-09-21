package project.builders;

import project.etity.Car;
import project.etity.Roominess;

public class CarSkodaBuilder implements CarBuilder {
    @Override
    public Car createCar() {
        return new Car("Shoda", "Fabia", 9000, 12, 220, Roominess.SIX);
    }
}
