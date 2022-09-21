package project;

import java.util.*;

public class Methods {
    Scanner scanner = new Scanner(System.in);

    public void multiplicationTable() {
        System.out.println("Task 1: ");
        int diagonal [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int vertical [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                System.out.printf("%5d", diagonal[i] * vertical[j]);
            }
            System.out.println();
        }
    }

    public void reverseArray(int array []) {
        System.out.println("Task 2: ");
        System.out.println(Arrays.toString(array));
        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.addAll(Collections.singleton(i));
        }

        Collections.reverse(list);
        System.out.println(list);
    }

    public void reverseArray(String array []) {
        System.out.println("Task 2: ");
        System.out.println(Arrays.toString(array));
        List<String> list = new ArrayList<>();

        for (String i : array) {
            list.addAll(Collections.singleton(i));
        }

        Collections.reverse(list);
        System.out.println(list);
    }

    public void divisibleThree() {
        System.out.println("Task 4: ");
        System.out.println("Numbers from 1 to 100 that are divisible by 3 without a remainder: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public void month() {
        System.out.println("Task 9: ");
        String choice = String.valueOf(scanner.next().trim().charAt(0));

        switch (choice) {
            case "1" : {
                System.out.println("January");
                break;
            }
            case "2" : {
                System.out.println("February");
                break;
            }
            case "3" : {
                System.out.println("March");
                break;
            }
            case "4" : {
                System.out.println("April");
                break;
            }
            case "5" : {
                System.out.println("May");
                break;
            }
            case "6" : {
                System.out.println("June");
                break;
            }
            case "7" : {
                System.out.println("July");
                break;
            }
            case "8" : {
                System.out.println("August");
                break;
            }
            case "9" : {
                System.out.println("September");
                break;
            }
            case "10" : {
                System.out.println("October");
                break;
            }
            case "11" : {
                System.out.println("November");
                break;
            }
            case "12" : {
                System.out.println("December");
                break;
            }
        }
    }
}
