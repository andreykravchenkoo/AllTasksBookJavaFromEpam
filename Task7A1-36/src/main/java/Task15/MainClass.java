package Task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<>();

        Point point1 = new Point(4, 8);
        Point point2 = new Point(1, 9);
        Point point3 = new Point(-6, 2);
        Point point4 = new Point(3, -8);
        Point point5 = new Point(2, 3);

        pointList.add(point1);
        pointList.add(point2);
        pointList.add(point3);
        pointList.add(point4);
        pointList.add(point5);

        System.out.println(pointList);

        PointService pointService = (p) -> {
            Collections.sort(pointList, (p1, p2) -> p1.getX() * p1.getX() + p1.getY() * p1.getY() - p2.getX() * p2.getX() + p2.getY() * p2.getY());
            System.out.println(pointList);
        };

        pointService.distance(pointList);
    }
}
