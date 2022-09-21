package Task8.poject;

import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            System.out.println(text);
            Pattern pattern = Pattern.compile("\\([^)]+\\)");
            String result = text.replaceAll(String.valueOf(pattern), "");
            System.out.println(result);
        };

        String text = "Andrey smoke (iqos) everyday ";
        textService.deletePartText(text);
    }
}
