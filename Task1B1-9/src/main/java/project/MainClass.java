package project;

public class MainClass {
    public static void main(String[] args) {
        int [] numbers = {3, 44, 53, 67, 35};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("odd numbers: " + numbers[i]);
            } else if (numbers[i] % 2 == 0) {
                System.out.println("Even numbers: " + numbers[i]);
            }
        }

        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max number: " + maxNumber);

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Min number: " + minNumber);

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 3 == 0) || (numbers[i] % 9 == 0)) {
                System.out.println("Number that is divisible by 3 or 9: " + numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 5 == 0) && (numbers[i] % 7 == 0)) {
                System.out.println("Number that is divisible by 3 or 9: " + numbers[i]);
            }
        }
    }
}
