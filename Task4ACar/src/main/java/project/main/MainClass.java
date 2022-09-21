package project.main;

import project.entity.Car;
import project.entity.Engine;
import project.entity.Wheel;
import project.utils.CarUtils;

public class MainClass {
    public static void main(String[] args) {
        CarUtils carUtils = new CarUtils();
        Wheel wheel = new Wheel(185, 65, 14);

        Car car1 = new Car(new Engine("N57", 2.0, 250), 80, "BMW F30 328I",
                new Wheel(205, 55, 16), new Wheel(205, 55, 16),
                new Wheel(205, 55, 16), new Wheel(205, 55, 16));

        Car car2 = new Car(30, "BMW F10 550",
                new Wheel(205, 55, 16), new Wheel(205, 55, 16),
                new Wheel(205, 55, 16), new Wheel(205, 55, 16));

        carUtils.drive(car1);
        carUtils.drive(car2);

        carUtils.refuel(car1, 30);
        carUtils.refuel(car2, 55);

        carUtils.wheelReplacement(car1, wheel);
    }
}
