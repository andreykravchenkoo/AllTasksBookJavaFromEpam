package Task5;

public class MainClass {
    public static void main(String[] args) {
        NumbersService numbersService = new NumbersService();

        numbersService.addNumber(2);
        numbersService.addNumber(6);
        numbersService.addNumber(8);
        numbersService.addNumber(1);
        numbersService.addNumber(9);
        numbersService.getAllRepository();
        numbersService.removeNumber(1);
        numbersService.getAllRepository();
        numbersService.searchNumber(7);
    }
}
