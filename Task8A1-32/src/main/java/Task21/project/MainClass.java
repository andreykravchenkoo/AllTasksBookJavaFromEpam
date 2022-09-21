package Task21.project;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            System.out.println(text);
          text = text.replaceAll("\\D+", " ");
          int[] arrayNumber = Arrays.stream(text.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(arrayNumber).sum();
            System.out.println("Sum numbers: " +  sum);
        };

        String text = "i 5 am 2 56 77 Andrey 2";
        textService.sumNumbers(text);
    }
}
