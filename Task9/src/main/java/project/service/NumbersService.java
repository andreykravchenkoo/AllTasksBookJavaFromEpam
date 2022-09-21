package project.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class NumbersService {

    public static List<Double> readFile(String str) {
        List<Double> numbersList = new ArrayList<>();

        try {

            Path path = FileSystems.getDefault().getPath(str);
            List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);
            String allLines = strings.toString();
            allLines = allLines.replaceAll("\\[", "");
            allLines = allLines.replaceAll("\\]", "");
            String[] arrayString = allLines.split("\\s+");
            double[] arrayNumbers = Arrays.stream(arrayString).mapToDouble(Double::parseDouble).toArray();
            numbersList = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbersList;
    }

    public static void sumNumbers(List<Double> list) {
        Double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Sum numbers: " + sum);
    }

    public static void  averageNumbers(List<Double> list) {
        OptionalDouble average = list.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("Average numbers: " + average);
    }
}
