package project.entity;

import java.util.Objects;

public class Wheel {
    private int width;
    private int height;
    private int diameter;

    public Wheel(int width, int height, int diameter) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return width == wheel.width && height == wheel.height && diameter == wheel.diameter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, diameter);
    }

    @Override
    public String toString() {
        return "Wheel( " + "width= " + width + ", height= " + height + ", diameter= " + diameter + " )";
    }
}
