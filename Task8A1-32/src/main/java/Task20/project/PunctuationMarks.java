package Task20.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationMarks {
    public static void countPunctuation(String text) {
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        System.out.println("Count of punctuation marks on text: " + count);
    }
}
