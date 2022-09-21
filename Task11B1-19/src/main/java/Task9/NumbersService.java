package Task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumbersService {
    private List<Integer> c1 = new ArrayList<>();
    private List<Integer> c2 = new ArrayList<>();

    public void showLists() {
        addingToList();
        System.out.println("List C1: " + c1);
        System.out.println("List C2: " + c2);
        sortingList();
        System.out.println("Sorted list C1: " + c1);
        joinList();
        System.out.println("Combined C1 and C2: " + c1);
    }

    private void joinList() {
        c1.addAll(c2);
        Collections.sort(c1);
    }

    private void sortingList() {
        Collections.sort(c1);
    }

    private void addingToList() {
        int i;

        try {
            Scanner scanner = new Scanner(new File("Numbers.txt"));
            boolean select = false;
            while (scanner.hasNextInt()) {
                i = scanner.nextInt();
                if (i < 0) {
                    select = true;
                    continue;
                }
                if (!select) {
                    c1.add(i);
                } else {
                    c2.add(i);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
