package project.entity;

import java.util.Objects;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    private TriangleType triangleType;
    private int Square;
    private int Perimeter;

    public Triangle(int sideA, int sideB, int sideC, TriangleType triangleType, int square, int perimeter) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.triangleType = triangleType;
        Square = square;
        Perimeter = perimeter;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public TriangleType getTriangleType() {
        return triangleType;
    }

    public void setTriangleType(TriangleType triangleType) {
        this.triangleType = triangleType;
    }

    public int getSquare() {
        return Square;
    }

    public void setSquare(int square) {
        Square = square;
    }

    public int getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(int perimeter) {
        Perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC && Square == triangle.Square && Perimeter == triangle.Perimeter && triangleType == triangle.triangleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, triangleType, Square, Perimeter);
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "sideA= " + sideA +
                ", sideB= " + sideB +
                ", sideC= " + sideC +
                ", triangleType= " + triangleType +
                ", Square= " + Square +
                ", Perimeter= " + Perimeter +
                '}';
    }
}
