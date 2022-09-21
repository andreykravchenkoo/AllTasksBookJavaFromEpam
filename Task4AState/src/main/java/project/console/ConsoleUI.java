package project.console;

import project.entity.Region;
import project.entity.State;
import project.entity.StateObject;
import project.utils.StateObjectRepository;
import project.utils.StateObjectService;
import project.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    private StateObjectService stateObject;
    private State state;
    private Scanner scanner;

    public ConsoleUI(StateObjectService stateObject, State state) {
        this.stateObject = stateObject;
        this.state = state;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        helloMessage();
        String choice = getChoiceOneChar();

        switch (choice) {
            case "1": {
                runMethodGetCapacityName();
                break;
            }
            case "2": {
                runMethodGetNumbersRegion();
                break;
            }
            case "3": {
                runMethodGetAreaState();
                break;
            }
            case "4": {
                runMethodGetNameRegionalCenter();
                break;
            }
            case "5": {
                runMethodGetStateObjectToString();
                break;
            }
            case "6": {
                System.out.println("Thanks for using this program. Bye");
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

    private void runMethodGetCapacityName() {
        System.out.println("Capacity name: " + state.getCapital());
    }

    private void runMethodGetNumbersRegion() {
        ArrayList<Region> regions = stateObject.getAllRegion();
        System.out.println("In the current region: " + regions.size());
    }

    private void runMethodGetAreaState() {
        System.out.println("Area state: " + state.getArea());
    }

    private void runMethodGetNameRegionalCenter() {
        System.out.println("Regional center: " + stateObject.getRegion().getRegionalCenter());
    }

    private void runMethodGetStateObjectToString() {
        Utils.stateToString(state);
    }

    private void helloMessage() {
        System.out.println("----------------------------------------");
        System.out.println("Pleas input char to choose function");
        System.out.println("1 - get name capital");
        System.out.println("2 - get numbers region");
        System.out.println("3 - get area state");
        System.out.println("4 - get regional center name");
        System.out.println("5 - state object to string");
        System.out.println("6 - exit");
    }
}
