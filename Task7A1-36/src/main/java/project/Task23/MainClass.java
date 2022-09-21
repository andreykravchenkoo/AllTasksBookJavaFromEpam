package project.Task23;

import java.util.Arrays;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        InWordsService inWordsService = (a) -> {
            if (a > 0) {
                int[] array = new int[16];

                for (int i = 0; i < array.length; i++) {
                    int number = a % 10;
                    array[i] = number;
                    a = a / 10;
                }

                for (int i = array.length-1; i >= 0; i--) {

                    if (array[i] == 1) {
                        System.out.print("One ");
                    } else if (array[i] == 2) {
                        System.out.print("Two ");
                    } else if (array[i] == 3) {
                        System.out.print("Three ");
                    } else if (array[i] == 4) {
                        System.out.print("Four ");
                    } else if (array[i] == 5) {
                        System.out.print("Five ");
                    } else if (array[i] == 6) {
                        System.out.print("Six ");
                    } else if (array[i] == 7) {
                        System.out.print("Seven ");
                    } else if (array[i] == 8) {
                        System.out.print("Eight ");
                    } else if (array[0] == 9) {
                        System.out.print("Nine ");
                    }
                }
            }
        };

        inWordsService.inWords(254);
    }
}