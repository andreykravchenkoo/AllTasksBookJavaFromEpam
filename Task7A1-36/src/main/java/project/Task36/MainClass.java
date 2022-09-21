package project.Task36;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        String[] array = {"Andrey", "And", "ATU", "Dnipro", "BMW"};

        System.out.println(Arrays.stream(array).filter(s -> s.contains("A")).filter(s -> s.length() == 3).collect(Collectors.toList()));
    }
}
