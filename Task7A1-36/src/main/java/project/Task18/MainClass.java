package project.Task18;

public class MainClass {
    public static void main(String[] args) {
        NumbersService numbersService = (x, n) -> {
            System.out.println(x / n);
        };

        numbersService.numbers(68, 14);
    }
}
