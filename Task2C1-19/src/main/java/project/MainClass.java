package project;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[][] matrix = methods.generateMatrix();
        methods.transposeMatrix(matrix);
        methods.zeroToRight(matrix);
    }
}
