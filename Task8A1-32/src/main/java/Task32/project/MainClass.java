package Task32.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            Pattern pattern = Pattern.compile("(wait\\b)");
            Matcher matcher = pattern.matcher(text);

            int count = 0;

            while (matcher.find()) {
                count++;
            }

            System.out.println("Count of specified word in the text: " + count);
        };

        String text = "I have a Dream, get job in IT wait company waiting";
        textService.countWord(text);
    }
}
