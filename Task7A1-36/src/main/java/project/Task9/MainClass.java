package project.Task9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("Text.txt");
        List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
        String text = list.toString();
        char symbol1 = 'a';
        char symbol2 = 'A';

        System.out.println("Count of " + symbol1 + ": " + text.chars().filter(c -> c == symbol1 | c == symbol2).count());
    }
}
