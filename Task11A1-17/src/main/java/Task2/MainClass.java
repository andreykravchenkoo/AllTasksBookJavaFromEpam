package Task2;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int numbers = scanner.nextInt();

        while (numbers > 0) {
            stack.push(numbers % 10);
            numbers = numbers / 10;
        }

        System.out.println("Your input: " + stack);

        int k = 0;
        int p = 1;
        int i;

        while (!stack.empty()) {
            i = stack.pop();
            k = k + i * p;
            p = p * 10;
        }

        System.out.println("Revers numbers: " + k);
    }
}
