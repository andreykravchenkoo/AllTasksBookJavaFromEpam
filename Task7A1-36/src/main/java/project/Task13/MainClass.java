package project.Task13;

import java.util.Arrays;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        Integer[] array = {11, 2, 54, 42, 5, 68, 17, 28, 39, 10};

        Arrays.sort(array, (i1, i2) -> Integer.compare(i2, i1));

        System.out.println(Arrays.toString(array));
    }
}
