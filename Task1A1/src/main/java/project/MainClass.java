package project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter your name and press 'Enter': ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);
    }
}
