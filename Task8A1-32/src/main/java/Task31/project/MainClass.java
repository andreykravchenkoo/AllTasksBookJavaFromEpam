package Task31.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            Pattern pattern = Pattern.compile("\\b[A-Z]");
            Matcher matcher = pattern.matcher(text);

            int count = 0;

            while (matcher.find()) {
                count++;
            }

            System.out.println("Count of word in capital letter: " + count);
        };

        String text = "I have a Dream, get job in IT company";
        textService.countCapitalLetters(text);
    }
}
