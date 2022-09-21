package project.utils;

import project.entity.Triangle;
import project.entity.TriangleType;

import java.util.*;

public class Utils {
    List<Triangle> triangleList = new ArrayList<>();

    public void addTriangle(Triangle tr) {
        int square = (tr.getSideA() + tr.getSideB() + tr.getSideC()) / 2;
        int perimeter = tr.getSideA() + tr.getSideB() + tr.getSideC();
        tr.setPerimeter(perimeter);
        tr.setSquare(square);
        triangleList.add(tr);
    }

    public void showList() {
        for (Triangle tr : triangleList) {
            System.out.println(tr);
        }
    }

    public void getSquareAndPerimeter(Triangle tr) {
        int square = (tr.getSideA() + tr.getSideB() + tr.getSideC()) / 2;
        int perimeter = tr.getSideA() + tr.getSideB() + tr.getSideC();
        tr.setPerimeter(perimeter);
        tr.setSquare(square);
    }

    private void getQuantityType(List<Triangle> triangleList) {
        int equilateral = 0;
        int isosceles = 0;
        int rectangular = 0;
        int arbitrary = 0;

        for (Triangle tr : triangleList) {

            if (tr.getTriangleType() == TriangleType.EQUILATERAl) {
                equilateral++;
            }

            if (tr.getTriangleType() == TriangleType.ISOSCELES) {
                isosceles++;
            }

            if (tr.getTriangleType() == TriangleType.RECTANGUlAR) {
                rectangular++;
            }

            if (tr.getTriangleType() == TriangleType.ARBITRARY) {
                arbitrary++;
            }
        }

        System.out.println("Quantity equilateral: " + equilateral);
        System.out.println("Quantity isosceles: " + isosceles);
        System.out.println("Quantity rectangular: " + rectangular);
        System.out.println("Quantity arbitrary: " + arbitrary);
    }

    public void showQuantityType() {
        getQuantityType(triangleList);
    }

    public void findTriangleMaxSquare() {
        int equilateralMax = 0;
        int isoscelesMax = 0;
        int rectangularMax = 0;
        int arbitraryMax = 0;

        for (int i = 0; i < triangleList.size(); i++) {

            if (triangleList.get(i).getTriangleType() == TriangleType.EQUILATERAl) {
                if (triangleList.get(i).getSquare() > equilateralMax) {
                    equilateralMax = triangleList.get(i).getSquare();
                }
            }

            if (triangleList.get(i).getTriangleType() == TriangleType.ISOSCELES) {
                if (triangleList.get(i).getSquare() > isoscelesMax) {
                    isoscelesMax = triangleList.get(i).getSquare();
                }
            }

            if (triangleList.get(i).getTriangleType() == TriangleType.RECTANGUlAR) {
                if (triangleList.get(i).getSquare() > rectangularMax) {
                    rectangularMax = triangleList.get(i).getSquare();
                }
            }

            if (triangleList.get(i).getTriangleType() == TriangleType.ARBITRARY) {
                if (triangleList.get(i).getSquare() > arbitraryMax) {
                    arbitraryMax = triangleList.get(i).getSquare();
                }
            }
        }

        similaritySquareEquilateral(equilateralMax);
        similaritySquareIsosceles(isoscelesMax);
        similaritySquareRectangular(rectangularMax);
        similaritySquareArbitrary(arbitraryMax);
    }

    private void similaritySquareEquilateral(int maxSquare) {
        for (Triangle tr : triangleList) {
            if (tr.getSquare() == maxSquare && tr.getTriangleType() == TriangleType.EQUILATERAl) {
                System.out.println("The largest area equilateral: " + tr);
            }
        }
    }

    private void similaritySquareIsosceles(int maxSquare) {
        for (Triangle tr : triangleList) {
            if (tr.getSquare() == maxSquare && tr.getTriangleType() == TriangleType.ISOSCELES) {
                System.out.println("The largest area isosceles : " + tr);
            }
        }
    }

    private void similaritySquareRectangular(int maxSquare) {
        for (Triangle tr : triangleList) {
            if (tr.getSquare() == maxSquare && tr.getTriangleType() == TriangleType.RECTANGUlAR) {
                System.out.println("The largest area rectangular : " + tr);
            }
        }
    }

    private void similaritySquareArbitrary(int maxSquare) {
        for (Triangle tr : triangleList) {
            if (tr.getSquare() == maxSquare && tr.getTriangleType() == TriangleType.ARBITRARY) {
                System.out.println("The largest area arbitrary : " + tr);
            }
        }
    }
}

