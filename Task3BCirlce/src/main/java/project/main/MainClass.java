package project.main;

import project.entity.Circle;
import project.utils.Utils;

public class MainClass {
    public static void main(String[] args) {
        Utils utils = new Utils();

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(18);
        Circle circle3 = new Circle(7);
        Circle circle4 = new Circle(31);
        Circle circle5 = new Circle(15);

        utils.getSquareAndPerimeter(circle1);
        utils.getSquareAndPerimeter(circle2);
        utils.getSquareAndPerimeter(circle3);
        utils.getSquareAndPerimeter(circle4);
        utils.getSquareAndPerimeter(circle5);

        utils.addCircle(circle1);
        utils.addCircle(circle2);
        utils.addCircle(circle3);
        utils.addCircle(circle4);
        utils.addCircle(circle5);

        utils.showList();
        System.out.println("");
        utils.findMaxSquare();
        System.out.println("");
        utils.findMinSquare();
    }
}
