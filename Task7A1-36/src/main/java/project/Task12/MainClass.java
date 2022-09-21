package project.Task12;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array2 = Arrays.stream(array).filter(i -> i % 2 != 0).toArray();

        System.out.println(Arrays.toString(array2));
    }
}
