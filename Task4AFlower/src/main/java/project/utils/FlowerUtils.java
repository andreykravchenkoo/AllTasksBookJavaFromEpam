package project.utils;

import project.entity.Bud;
import project.entity.Flower;

public class FlowerUtils {

    public void bloom(Flower flower) {
        if (flower.isSluggish() == true) {
            System.out.println("Flower cannot bloom");
        } else {
            System.out.println("Flower bloom");
        }
    }

    public void wither(Flower flower) {
        if (flower.isSluggish() == true) {
            System.out.println("Flower withered");
        } else {
            System.out.println("Flower cannot withered");
        }
    }

    public void GetColorBut(Flower flower) {
        System.out.println("Color bud: " + flower.getBud().getColor());
    }
}
