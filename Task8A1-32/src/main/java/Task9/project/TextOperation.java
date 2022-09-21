package Task9.project;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class TextOperation {
    public static void countWord(String text) {
        String[] arrayString = text.toLowerCase(Locale.ROOT).replaceAll("[-.?!)(,:]", "").trim().split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();

        for (String word : arrayString) {
            if (!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if (count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for (String word : counterMap.keySet()) {
            System.out.println(word + " : " + counterMap.get(word));
        }
    }
}
