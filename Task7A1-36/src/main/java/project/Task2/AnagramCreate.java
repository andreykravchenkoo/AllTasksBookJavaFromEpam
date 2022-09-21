package project.Task2;

import java.util.Arrays;

public class AnagramCreate implements AnagramService {
    @Override
    public boolean anagram(String wordFirst, String wordSecond) {
        char[] word1 = wordFirst.toCharArray();
        char[] word2 = wordSecond.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
