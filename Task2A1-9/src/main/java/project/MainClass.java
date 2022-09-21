package project;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
        Methods methods = new Methods();
        String numbers [] = {"25", "2", "463", "33", "7", "89", "43", "1", "6679", "10"};
        int numbers2 [] = {25, 2, 463, 33, 7, 89, 43, 1, 6679, 10};

        methods.maxMinLengthArrayNumbers(numbers2);
        methods.sortLengthArray(numbers2);
        methods.showNumbersLessThanAverage(numbers2);
    }
}
