package Task11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,1,-20,40,5,-23,0);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
