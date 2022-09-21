package Task28.project;

import java.util.Arrays;
import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            System.out.println(text);
            String[] sentence = text.toLowerCase(Locale.ROOT).trim().split("\\. ");

            for (int i = 0; i < sentence.length; i++) {
                sentence[i] = sentence[i].substring(0, 1).toUpperCase() + sentence[i].substring(1);
            }

            System.out.println(Arrays.toString(sentence));
        };

        String text = "The split method of the String class accepts a String value representing the delimiter and splits into an array of tokens words. Treating the string between the occurrence of two delimiters as one token.";

        textService.capitalLatterSentence(text);
    }
}
