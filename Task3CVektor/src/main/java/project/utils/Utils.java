package project.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


public class Utils {
    List<Vector> vectorList = new ArrayList<>();

    public void addVector(Vector vc) {
        vectorList.add(vc);
    }

    public void showList() {
        System.out.println("List vectors: ");

        for (Vector vr : vectorList) {
            System.out.println(vr);
        }
    }

    public void getModuleVector(project.entity.Vector vector) {
         int module = (int) Math.sqrt(Math.pow(vector.getPoint2().getX() - vector.getPoint1().getX(), 2) + Math.pow(vector.getPoint2().getY() - vector.getPoint1().getY(), 2));

         System.out.println("Module vector " + vector + " = " + module);
        System.out.println("");
    }

    public void getScalarProduct(project.entity.Vector vector1, project.entity.Vector vector2) {
        int[] vectorCoordinate1 = getVectorByCoordinates(vector1);
        int[] vectorCoordinate2 = getVectorByCoordinates(vector2);

        int scalarProduct = vectorCoordinate1[0] * vectorCoordinate2[0] + vectorCoordinate1[1] * vectorCoordinate2[1];

        System.out.println("Scalar product vectors " + vector1 + ", " + vector2 + " = " + scalarProduct);
        System.out.println("");
    }

    public void getVectorAdditionAndSubtraction(project.entity.Vector vector1, project.entity.Vector vector2) {
        int[] vectorCoordinate1 = getVectorByCoordinates(vector1);
        int[] vectorCoordinate2 = getVectorByCoordinates(vector2);

        int[] vectorAddition = {vectorCoordinate1[0] + vectorCoordinate2[0], vectorCoordinate1[1] + vectorCoordinate2[1]};
        int[] vectorSubtraction = {vectorCoordinate1[0] - vectorCoordinate2[0], vectorCoordinate1[1] - vectorCoordinate2[1]};

        System.out.println("Vector addition " + vector1 + ", " + vector2 + " = " + Arrays.toString(vectorAddition));
        System.out.println("Vector subtraction " + vector1 + ", " + vector2 + " = " + Arrays.toString(vectorSubtraction));
        System.out.println("");
    }

    public void getMultiplicationConstant(project.entity.Vector vector, int constant) {
        int[] vectorCoordinate = getVectorByCoordinates(vector);
        int[] multiplication = {constant * vectorCoordinate[0], constant * vectorCoordinate[1]};

        System.out.println("Multiplication constant vector " + vector + " = " + Arrays.toString(multiplication));
        System.out.println("");
    }

    private int[] getVectorByCoordinates(project.entity.Vector vector) {
        int[] vectorCoordinates = {vector.getPoint2().getX() - vector.getPoint1().getX(), vector.getPoint2().getY() - vector.getPoint1().getY()};

        return vectorCoordinates;
    }
}
