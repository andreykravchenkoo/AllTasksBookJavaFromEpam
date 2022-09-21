package project.console;

import project.entity.Bud;
import project.entity.Flower;
import project.utils.FlowerUtils;

import java.util.Scanner;

public class ConsoleUI {
    Flower flower = new Flower(new Bud("Red"), true);
    FlowerUtils flowerUtils = new FlowerUtils();
    Scanner scanner = new Scanner(System.in);

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
                flowerUtils.bloom(flower);
                break;
            }
            case "2": {
                flowerUtils.wither(flower);
                break;
            }
            case "3": {
                flowerUtils.GetColorBut(flower);
                break;
            }
            case "4": {
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

    private void helloMessage() {
        System.out.println("1 - bloom");
        System.out.println("2 - wither");
        System.out.println("3 - get color bud");
        System.out.println("4 - exit");
    }
}
