package Task2.project;

public class MainClass {
    public static void main(String[] args) {
        AlphabetNumber alphabetNumber = (s) -> {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            char[] charArray = s.toCharArray();

            for (char l : charArray) {
                System.out.print(l + " ");
            }

            System.out.println("");

            for (char x : charArray) {
                if (x == ' ') {
                    System.out.print(" ");
                } else {
                    int number = alphabet.lastIndexOf(x);
                    number += 1;
                    System.out.print(number + " ");
                }
            }
        };

        String str = "i learn java year";
        alphabetNumber.numberLetter(str);
    }
}
