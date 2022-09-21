package Task12;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList arrayList = TextService.read("Poem.txt");

        System.out.println(arrayList);

        TextService.sortArrayList(arrayList);
    }
}
