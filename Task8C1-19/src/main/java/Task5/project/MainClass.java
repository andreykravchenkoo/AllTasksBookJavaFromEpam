package Task5.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        String str = "helloowoorldd";

        Pattern pattern = Pattern.compile("(.)\\1{0,}");
        Matcher matcher = pattern.matcher(str);

        String result = "";

        while (matcher.find()) {
            result += matcher.group(1);
            int length = matcher.group().length();
            if (length > 1) {
                result += length;
            }
        }

        System.out.println(result);
    }
}
