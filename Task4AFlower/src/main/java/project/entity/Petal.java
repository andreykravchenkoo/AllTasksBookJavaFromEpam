package project.entity;

import java.util.Objects;

public class Petal {
    private String color;

    public Petal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Petal petal = (Petal) o;
        return Objects.equals(color, petal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Petal{ " + "color= " + color + " }";
    }
}
