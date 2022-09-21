package Task12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextService {
    public static ArrayList<String> read(String path) {
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(path));

            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return arrayList;
    }

    public static void sortArrayList(ArrayList<String> list) {
        Collections.sort(list);

        System.out.println(list);
    }
}
