package project.main;

import project.controllers.consoleController.ConsoleController;

public class MainClass {
    public static void main(String[] args) {
        ConsoleController consoleController = new ConsoleController();
        consoleController.run();
    }
}
