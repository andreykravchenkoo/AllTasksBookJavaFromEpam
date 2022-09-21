package Task19.project;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertText {
    public static void capitalLetter(String text) {
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);

        String[] arrayText = text.trim().toLowerCase(Locale.ROOT).split("\\s");

        if (matcher.find()) {
            for (int i = 0; i < arrayText.length; i++) {
                arrayText[i] = arrayText[i].substring(0, 1).toUpperCase(Locale.ROOT) + arrayText[i].substring(1);
            }
        }

        System.out.println(Arrays.toString(arrayText));
    }
}
