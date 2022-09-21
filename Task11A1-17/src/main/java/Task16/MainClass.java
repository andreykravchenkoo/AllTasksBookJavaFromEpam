package Task16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Andrey");
        hashMap.put(1, "Danil");
        hashMap.put(2, "Elena");
        hashMap.put(3, "Vitaliy");
        hashMap.put(4, "Darya");
        hashMap.put(5, "Anastasia");
        hashMap.put(6, "Egor");
        hashMap.put(7, "Aleksandr");
        hashMap.put(8, "Dmytro");
        hashMap.put(9, "Nikolay");

        System.out.println("Lines with a key > 5: ");
        hashMap.entrySet().stream().filter(n -> n.getKey() > 5).forEach(System.out::println);

        System.out.println("If key = 0, output lines separated by commas: ");
        hashMap.entrySet().stream().filter(n -> n.getKey() ==0).forEach(n -> System.out.println(n.getValue() + ", "));

        System.out.println("Multiply all keys where string length > 5: ");
        System.out.println(hashMap.entrySet().stream().filter(n -> n.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(2, (x, y) -> x * y));
    }
}
