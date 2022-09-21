package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        String poem = "But O heart! heart! heart!\n" +
                "O the bleeding drops of red,\n" +
                "Where on the deck my Captain lies,\n" +
                "Fallen cold and dead.\n" +
                "O Captain! my Captain! rise up and hear the bells;\n" +
                "Rise up—for you the flag is flung—for you the bugle trills;\n" +
                "For you bouquets and ribbon'd wreaths—for you the shores a-crowding;\n" +
                "For you they call, the swaying mass, their eager faces turning";

        List<String> list = Arrays.asList(poem.split("\n"));

        list.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(s -> System.out.println(s + " "));
    }
}
