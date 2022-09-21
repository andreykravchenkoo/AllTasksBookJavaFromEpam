package project.main;

import project.entity.Triangle;
import project.entity.TriangleType;
import project.utils.Utils;

public class MainClass {
    public static void main(String[] args) {
        Utils utils = new Utils();

        Triangle triangle1 = new Triangle(5, 7, 5, TriangleType.ISOSCELES, 0, 0);
        Triangle triangle2 = new Triangle(12, 18, 12, TriangleType.ISOSCELES, 0, 0);
        Triangle triangle3 = new Triangle(8, 8, 8, TriangleType.EQUILATERAl, 0, 0);
        Triangle triangle4 = new Triangle(10, 6, 9, TriangleType.RECTANGUlAR, 0, 0);
        Triangle triangle5 = new Triangle(15, 20, 25, TriangleType.ARBITRARY, 0, 0);

        utils.getSquareAndPerimeter(triangle1);
        utils.getSquareAndPerimeter(triangle2);
        utils.getSquareAndPerimeter(triangle3);
        utils.getSquareAndPerimeter(triangle4);
        utils.getSquareAndPerimeter(triangle5);

        utils.addTriangle(triangle1);
        utils.addTriangle(triangle2);
        utils.addTriangle(triangle3);
        utils.addTriangle(triangle4);
        utils.addTriangle(triangle5);

        utils.showList();
        System.out.println("");
        utils.showQuantityType();
        System.out.println("");
        utils.findTriangleMaxSquare();
    }
}
