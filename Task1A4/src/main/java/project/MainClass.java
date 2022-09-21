package project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String samplePassword = "njgjkm2003";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = scanner.next();
        if (samplePassword.equals(password)) {
            System.out.println("Password true");
        } else {
            System.out.println("Password false");
        }
    }
}
