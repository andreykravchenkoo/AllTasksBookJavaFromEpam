package Task10.project;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            char[] arrayText = text.toLowerCase(Locale.ROOT).replaceAll(" ", "").toCharArray();

            Map<Character, Integer> counter = new HashMap<>();

            for (char letter : arrayText) {
                Integer count = counter.get(letter);
                if (count == null) {
                    count = 0;
                }
                counter.put(letter, ++count);
            }

            LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();

            counter.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

            for (char letter : sortedMap.keySet()) {
                System.out.println(letter + " : " + counter.get(letter));
            }
        };

        String text = "All general-purpose map implementation classes should provide two";
        textService.countLetters(text);
    }
}
