package Task30.project;

import java.util.Arrays;
import java.util.Locale;

public class TextAlphabet {
    public static void sortText(String text) {
        String[] word = text.trim().toLowerCase(Locale.ROOT).split("\\s+");

        Arrays.sort(word);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            stringBuilder.append(word[i] + " ");
        }

        String result = stringBuilder.toString();
        System.out.println("Sort text in alphabet: " + result);
    }
}
