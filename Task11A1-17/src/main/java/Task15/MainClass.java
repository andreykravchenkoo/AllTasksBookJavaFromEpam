package Task15;

import java.util.Arrays;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        String poem = TextService.read("Poem.txt");
        String[] arrayWords = TextService.arrayWords(poem);
        HashMap<String, Integer> hashMap = TextService.frequencyOccurrence(arrayWords);

        System.out.println(hashMap);
    }
}
