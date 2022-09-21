package project.service;

import project.entity.Sentence;
import project.entity.Text;
import project.entity.Word;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TextService {

    public static String readFromFile(String fileName) throws IOException {
            Path path = FileSystems.getDefault().getPath(fileName);
            String text = String.valueOf(Files.readAllLines(path));

        return text;
    }

    public static List<String> parseWord(Text text) {
        List<String> wordList = new ArrayList<>();
        String[] array = text.getText().replaceAll("\\p{Punct}", "").trim().split("\\s+");
        wordList = Arrays.asList(array);
        System.out.println("");
        return wordList;
    }

    public static List<String> parseSentence(Text text) {
        List<String> sentenceList = new ArrayList<>();
        String[] array = text.getText().trim().split("\\n|\\.(?!\\d)|(?<!\\d)\\.");
        sentenceList = Arrays.asList(array);
        System.out.println("");
        return sentenceList;
    }

    public static List<String> parseParagraph(Text text) {
        List<String> paragraphList = new ArrayList<>();
        String[] array = text.getText().split("    ");
        paragraphList = Arrays.asList(array);
        System.out.println("");
        return paragraphList;
    }

    public static void duplicateWord(Sentence sentence) {
        System.out.println("The sentence with the most identical words: " + sentence.getSentenceList().stream().sorted(Collections.reverseOrder(Comparator.comparingLong(x -> Arrays.stream(x.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().max(Comparator.comparingLong(Long::longValue))
                .get()))).findFirst());
        System.out.println("");
    }

    public static void sentenceSorted(Sentence sentence) {
        System.out.println("Sort sentence in ascending order of the number of words in each of them: ");
        Collections.sort(sentence.getSentenceList(), Comparator.comparing(String::length));
        sentence.getSentenceList().forEach(System.out::println);
        System.out.println("");
    }

    public static void wordSortedAlphabet(Word word) {
        System.out.println("Sort word by alphabet: ");
        word.getWordList().stream().map(String::toLowerCase).sorted().forEach(System.out::println);
        System.out.println("");
    }

}
