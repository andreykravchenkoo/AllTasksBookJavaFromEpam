package Task4.project;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Substring substring = (t, s, w) -> {
            System.out.println(t);

            StringBuilder stringBuilder = new StringBuilder(t);

            stringBuilder.insert(s, w);

            t = stringBuilder.toString();

            System.out.println(t);
        };

        String text = "В тексте после k-го символа вставить заданную подстроку.";

        substring.addSubstring(text, 4, "Hello");
    }
}
