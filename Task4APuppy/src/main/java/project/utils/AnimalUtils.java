package project.utils;

import project.entity.Puppy;

public class AnimalUtils {

    public void getNamePuppy(Puppy puppy) {
        System.out.println("Name puppy: " + puppy.getName());
    }

    public void castVoice(Puppy puppy) {
        System.out.println("Puppy voice " + puppy.getVoice());
    }

    public void jump(Puppy puppy) {
        if (puppy.isJump() == true) {
            System.out.println("Puppy jumps");
        } else {
            System.out.println("Puppy cant jumps");
        }
    }

    public void run(Puppy puppy) {
        if (puppy.isRun() == true) {
            System.out.println("Puppy runs");
        } else {
            System.out.println("Puppy cant runs");
        }
    }

    public void bite(Puppy puppy) {
        if (puppy.isBite() == true) {
            System.out.println("Puppy bite");
        } else {
            System.out.println("Puppy cant bite");
        }
    }
}
