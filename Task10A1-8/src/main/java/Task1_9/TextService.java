package Task1_9;

import org.w3c.dom.Text;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextService {

    public static String readFromFile(String str) {
        String result = "";

        try {
            Path path = FileSystems.getDefault().getPath(str);
            List<String> strings = Files.readAllLines(path);
            result = strings.stream().map(Objects::toString).collect(Collectors.joining(" "));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void deleteSubstring(String text, String regex) {
        System.out.println("Task 1: ");

        String[] arrayStr = text.split("\\.\\s+");

        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = arrayStr[i].replaceAll(regex, " ");
        }

        String result = Arrays.stream(arrayStr).map(Objects::toString).collect(Collectors.joining(". "));

        System.out.println(result);
    }

    public static void replaceSubstring(String text, String regex, String replacement) {
        System.out.println("Task 2: ");

        String[] arrayStr = text.split("\\.\\s+");

        if (replacement.length() > regex.length()) {

            for (int i = 0; i < arrayStr.length; i++) {
                arrayStr[i] = arrayStr[i].replaceAll(regex, replacement);
            }

        } else {
            System.out.println("Replacement less substring");
        }

        String result = Arrays.stream(arrayStr).map(Objects::toString).collect(Collectors.joining(". "));

        System.out.println(result);
    }

    public static void findVowelLatter(String text) {
        System.out.println("Task 3: ");

        List<String> list = new ArrayList<>();

        for (String line : text.split("\n")) {
            Arrays.stream(line.split(" ")).filter(i -> i.substring(0, 1).matches("^[AaEeUuIiOoYy]")).forEach(list::add);
        }

        System.out.println("All words starting with a vowel: " + list);
    }

    public static void sameLetter(String text) {
        System.out.println("Task 4: ");

        text = text.replaceAll("\\p{Punct}", "");

        String[] array = text.split("\\s+");

        for (int i = 0; i < array.length - 1; i++) {
            if (Character.toLowerCase(array[i].charAt(array[i].length() - 1)) == Character.toLowerCase(array[i + 1].charAt(0))) {
                System.out.println("Words of the text for which the last letter of one word" +
                        "matches the first letter of the next word: " + array[i] + " " + array[i + 1]);
            }
        }
    }

    public static void findMaxNumbers(String text) {
        System.out.println("Task 5: ");

        text = text.replaceAll("[^0-9]", " ");
        int[] array = Arrays.stream(text.trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        OptionalInt max = Arrays.stream(array).max();
        System.out.println("Max numbers: " + max);
    }

    public static void countWord(String text) {
        System.out.println("Task 6: ");
        System.out.println("Count the frequency " +
                "repeatability of each word from the given list and display these words\n" +
                "in ascending order of frequency");

        text = text.replaceAll("\\p{Punct}", "");

        List<String> list = Arrays.asList(text.split("\\s+"));
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

    public static void capitalizeFirstLetter(String text) {
        System.out.println("Task 7: ");

        char[] array = text.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                if (foundSpace) {
                    array[i] = Character.toUpperCase(array[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        String result = String.valueOf(array);

        System.out.println("Capitalize the first letter of a word: " + result);
    }
}
