package project.main;

import project.service.NumbersService;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Double> list = NumbersService.readFile("Text.txt");
        System.out.println(list);
        NumbersService.sumNumbers(list);
        NumbersService.averageNumbers(list);
    }
}
