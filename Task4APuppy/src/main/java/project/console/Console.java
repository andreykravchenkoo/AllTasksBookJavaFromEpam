package project.console;

import project.entity.Puppy;
import project.utils.AnimalUtils;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    AnimalUtils animalUtils = new AnimalUtils();
    Puppy puppy = new Puppy("Jack", "Gav-gav-Gav-gav", true, true, true);

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
                animalUtils.getNamePuppy(puppy);
                break;
            }
            case "2": {
                animalUtils.castVoice(puppy);
                break;
            }
            case "3": {
                animalUtils.jump(puppy);
                break;
            }
            case "4": {
                animalUtils.run(puppy);
                break;
            }
            case "5": {
                animalUtils.bite(puppy);
                break;
            }
            case "6": {
                System.out.println("Thanks for using this program. Bye");
                System.exit(0);
            }
            default: {
                System.out.println("Your input wrong choice!");
            }
        }
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void helloMessage() {
        System.out.println("-------------------------------------------");
        System.out.println("1 - Puppy name");
        System.out.println("2 - caste vote Puppy");
        System.out.println("3 - jump Puppy");
        System.out.println("4 - run Puppy");
        System.out.println("5 - bite Puppy");
        System.out.println("6 - exit");
    }
}
