package Task7.project;

import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        DeleteSymbol deleteSymbol = (text) -> {
            System.out.println(text);
            Pattern pattern = Pattern.compile("\\d+|\\p{Punct}+");
            String result = text.replaceAll(String.valueOf(pattern), " ");
            System.out.println(result);
        };

        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.";
        deleteSymbol.deleteSymbol(text);
    }
}
