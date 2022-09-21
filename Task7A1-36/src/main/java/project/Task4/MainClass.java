package project.Task4;

public class MainClass {
    public static void main(String[] args) {
        NumbersService numbersService = (a) -> {
            if (a % 13 == 0) {
                return true;
            }
            return false;
        };

        System.out.println(numbersService.withoutATrace(26));
    }
}
