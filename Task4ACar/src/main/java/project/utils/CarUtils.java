package project.utils;

import project.entity.Car;
import project.entity.Wheel;

public class CarUtils {

    public void drive(Car car) {
        if (car.getEngine() != null && car.getFuelQuantity() > 0) {
            System.out.println("Car " + car.getModel() + " drive");
        } else {
            System.out.println("car " + car.getModel() + " cannot be driven, parts are missing or there is not enough fuel");
        }

        System.out.println(" ");
    }

    public void refuel(Car car, int countFuel) {
        System.out.println("Quantity fuel car " + car.getModel() + " = " + car.getFuelQuantity());

        if (car.getFuelQuantity() == 100) {
            System.out.println(car.getModel() + " tank full");
        } else if (car.getFuelQuantity() + countFuel > 100) {
            int count = 100 - car.getFuelQuantity();
            car.setFuelQuantity(car.getFuelQuantity() + count);
        } else {
            car.setFuelQuantity(car.getFuelQuantity() + countFuel);
        }

        System.out.println("After refueling: " + car.getFuelQuantity());
        System.out.println(" ");
    }

    public void wheelReplacement(Car car, Wheel wheel) {
        System.out.println(car.getModel() + car.getFrontLeftWheel() + car.getFrontRightWheel() + car.getRearLeftWheel() + car.getRearRightWheel());

        car.setFrontLeftWheel(wheel);

        System.out.println("Wheel replace");
        System.out.println(car.getModel() + car.getFrontLeftWheel() + car.getFrontRightWheel() + car.getRearLeftWheel() + car.getRearRightWheel());
        System.out.println(" ");
    }
}
