package project.utils;

import project.entity.Circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
    List<Circle> circleList = new ArrayList<>();
    final static double π = 3.14;

    public void addCircle(Circle cl) {
        circleList.add(cl);
    }

    public void showList() {
        for (Circle cl : circleList) {
            System.out.println(cl);
        }
    }

    public void getSquareAndPerimeter(Circle cl) {
        double square = π * Math.pow(cl.getRadius(), 2);
        double perimeter = cl.getDiameter() * π;
        cl.setSquare(square);
        cl.setPerimeter(perimeter);
    }

    public void findMaxSquare() {
        double maxSquare = 0.0;

        for (int i = 0; i < circleList.size(); i++) {
            if (circleList.get(i).getSquare() > maxSquare) {
                maxSquare = circleList.get(i).getSquare();
            }
        }

        equalsSquare(maxSquare);
    }

    public void findMinSquare() {

    }

    private void equalsSquare(double maxMin) {
        for (Circle cl : circleList) {
            if (cl.getSquare() == maxMin) {
                System.out.println("Max square: " + cl);
            }
        }
    }
}
