package project.main;

import project.console.ConsoleUI;
import project.entity.*;
import project.utils.StateObjectRepository;
import project.utils.StateObjectService;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        State state = new State("Ukraine", "Kyiv", 40, new ArrayList<>());
        StateObject region1 = new Region("Dnipropetrovska", 1, 50, "Dnipro");
        StateObject region2 = new Region("Kyievska", 5, 50, "Kyiv");
        StateObject city = new City("Dnipro", 1, 20);
        StateObject district = new District("Topol", 1, 10);

        state.getStateObjects().add(region1);
        state.getStateObjects().add(region2);
        state.getStateObjects().add(city);
        state.getStateObjects().add(district);

        System.out.println(state.getStateObjects());

        StateObjectRepository stateObjectRepository = new StateObjectRepository(state.getStateObjects());
        StateObjectService stateObjectService = new StateObjectService(stateObjectRepository);
        ConsoleUI consoleUI = new ConsoleUI(stateObjectService, state);

        consoleUI.run();
    }
}
