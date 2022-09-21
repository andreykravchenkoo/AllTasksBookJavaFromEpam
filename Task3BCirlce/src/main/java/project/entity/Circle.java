package project.entity;

import java.util.Objects;

public class Circle {
    private double diameter;
    private double radius;
    private double square;
    private double perimeter;

    public Circle(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.diameter, diameter) == 0 && Double.compare(circle.radius, radius) == 0 && Double.compare(circle.square, square) == 0 && Double.compare(circle.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, radius, square, perimeter);
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "diameter= " + diameter +
                ", radius= " + radius +
                ", square= " + square +
                ", perimeter= " + perimeter +
                '}';
    }
}
