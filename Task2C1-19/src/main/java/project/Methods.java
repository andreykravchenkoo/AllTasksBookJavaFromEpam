package project;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Methods {

    public int[][] generateMatrix() {
        System.out.println("Task 0: ");
        Random random = new Random();
        int [][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int randomInt = random.nextInt(10);

                if (random.nextInt() > 0) {
                    randomInt *= 1;
                } else {
                    randomInt *= -1;
                }
                matrix[i][j] = randomInt;
            }
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("");

        return matrix;
    }

    public int[][] transposeMatrix(int[][] matrix) {
        System.out.println("Task 2: ");
        int[][] transposeMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        for (int[] row : transposeMatrix) {
            System.out.println(Arrays.toString(row));
        }

        return transposeMatrix;
    }

    public void zeroToRight(int[][] matrix) {
        System.out.println("Task 13: ");

        for (int i = 0; i < matrix.length; i++) {
            int n = 0;
            int[] c = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    c[n++] = matrix[i][j];
                }
            }
            matrix[i] = Arrays.copyOf(c, c.length);
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
