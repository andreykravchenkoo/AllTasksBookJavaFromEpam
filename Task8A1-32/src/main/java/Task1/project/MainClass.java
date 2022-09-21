package Task1.project;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLetters = scanner.nextInt();
        String latterNew = scanner.next();
        String text = "Hello, my name is Andrey, i learn java maybe year and i hope to the get job";
        String array[] = text.trim().split("\\s+");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > numberLetters) {
                char k = array[i].charAt(numberLetters);
                array[i] = array[i].replace(k, latterNew.charAt(0));
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
