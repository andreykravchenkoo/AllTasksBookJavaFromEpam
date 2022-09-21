package project;

import java.util.*;
import java.util.stream.IntStream;

public class Methods {

    public void maxMinLengthArrayNumbers(int intArray[]) {
        System.out.println("Task 1: ");

        for (int i : intArray) {
            int length = Integer.toString(i).length();
            System.out.println("Number: " + i + "\t Length: " + length);
        }

        System.out.println("------------------------------");
        System.out.println("");
    }

    public void sortLengthArray(int intArray[]) {
        int length = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int i : intArray) {
            integerList.addAll(Collections.singleton(i));
        }

        for (int i : intArray) {
            length = Integer.toString(i).length();
            list.addAll(Collections.singleton(length));
        }

        Collections.sort(list);
        Collections.sort(integerList);

        System.out.println("Sort length: ");
        System.out.println("Numbers: " + integerList);
        System.out.println("Length: " + list);

            System.out.println("------------------------------");
            System.out.println("");
    }

    public void showNumbersLessThanAverage(int[] intArray) {
        int sum = 0;

        for (int i : intArray) {
            sum += Integer.toString(i).length();
        }

        double average = sum / (double)intArray.length;
        for (int i : intArray) {
            int length = Integer.toString(i).length();
            if (length < average) {
                System.out.println("Number: " + i + "\tLength: " + length);
            }
        }
    }
}
