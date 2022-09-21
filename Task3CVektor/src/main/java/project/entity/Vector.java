package project.entity;

import java.util.Objects;
import java.util.function.IntFunction;

public class Vector extends java.util.Vector {
    Point point1;
    Point point2;

    public Vector(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Vector {" +
                "point 1 : " + point1 +
                " point 2 : " + point2 +
                " }";
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return super.toArray(generator);
    }
}
