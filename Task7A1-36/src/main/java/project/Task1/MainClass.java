package project.Task1;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println(intBinaryOperator.applyAsInt(6, 8));
        System.out.println("");

        String str = "Andrey learning Java";
        String regex = " ";
        Consumer<String> consumer = s -> System.out.println(Arrays.toString(str.split(regex)));
        consumer.accept(str);
        System.out.println("");

        String str2 = "Andrey";
        Pattern pattern = Pattern.compile("nd");
        Matcher matcher = pattern.matcher(str2);

        while (matcher.find()) {
            System.out.println("Start: " + matcher.start() + ", End: " + matcher.end());
        }
    }
}
