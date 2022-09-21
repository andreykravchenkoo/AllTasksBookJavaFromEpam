package project.controllers.consoleController;

import project.controllers.flightController.FlightController;

import java.util.Scanner;

public class ConsoleController {
    FlightController flightController = new FlightController();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        message();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "0": {
                flightController.addFlight();
                break;
            }
            case "1": {
                flightController.getFlightId(1);
                break;
            }
            case "2": {
                flightController.getDestination(1);
                break;
            }
            case "3": {
                flightController.getModelAirplane(1);
                break;
            }
            case "4": {
                flightController.getAirplaneStatus(1);
                break;
            }
            case "5": {
                flightController.getAverageFlightTime(1);
                break;
            }
            case "6": {
                flightController.getCurbWeight(1);
                break;
            }
            case "7": {
                flightController.getFuelQuantity(1);
                break;
            }
            case "8": {
                flightController.getSedToDestination(1, "Paris");
                break;
            }
            case "9": {
                flightController.getRepair(1);
                break;
            }
            case "a": {
                flightController.getRefuel(1, 200);
                break;
            }
            case "b": {
                flightController.getLoad(1, 150);
                break;
            }
            case "c": {
                flightController.getUnload(1, 400);
                break;
            }
            case "d": {
                flightController.getValue(1);
                break;
            }
            case "x": {
                System.out.println("Thanks for using this program");
                System.exit(0);

            }
            default: {
                System.out.println("Your input wrong choice");
            }
        }
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void message() {
        System.out.println("------------------------------------");
        System.out.println("0 - add flight");
        System.out.println("1 - get flight id");
        System.out.println("2 - get destination");
        System.out.println("3 - get model airplane");
        System.out.println("4 - get airplane status");
        System.out.println("5 - get average flight time");
        System.out.println("6 - get curb weight");
        System.out.println("7 - get fuel quantity");
        System.out.println("8 - sed to destination");
        System.out.println("9 - repair");
        System.out.println("a - refuel");
        System.out.println("b - load");
        System.out.println("c - unload");
        System.out.println("d - value");
        System.out.println("x - exit");
    }
}
