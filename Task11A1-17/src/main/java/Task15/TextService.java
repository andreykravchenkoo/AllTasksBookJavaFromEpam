package Task15;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class TextService {

    public static String read(String path) {
        String result = "";

        try {
            Path path1 = FileSystems.getDefault().getPath(path);
            List<String> list = Files.readAllLines(path1);

            for (String str : list) {
                result += str;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String[] arrayWords(String poem) {
        String[] arrayWord = poem.replaceAll("\\p{Punct}", " ").toLowerCase(Locale.ROOT).trim().split("\\s+");

        return arrayWord;
    }

    public static HashMap<String, Integer> frequencyOccurrence(String[] arrayWords) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : arrayWords) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }

        return hashMap;
    }
}
