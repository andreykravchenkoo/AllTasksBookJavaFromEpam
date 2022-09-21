package Task1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        try {
            Path path = FileSystems.getDefault().getPath("Text.txt");
            List<String> list = Files.readAllLines(path);

            Collections.reverse(list);

            File file = new File("TextResult.txt");
            PrintWriter printWriter = new PrintWriter(file);

            String result = "";

            for (String str : list) {
                result += str + "\n";
            }

            printWriter.println(result);

            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
