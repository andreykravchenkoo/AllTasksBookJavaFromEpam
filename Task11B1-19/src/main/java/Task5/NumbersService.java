package Task5;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class NumbersService {
    private NumbersRepository numbersRepository = new NumbersRepository();

    public void addNumber(int a) {
        System.out.println("Number you wont to add: " + a);
        numbersRepository.getIntegers().add(a);
    }

    public void removeNumber(int a) {
        System.out.println("Number tou wont to remove: " + a);
        numbersRepository.getIntegers().remove(Integer.valueOf(a));
    }

    public void searchNumber(int a) {
        System.out.println("Number you wont to search: " + a);
        int result = numbersRepository.getIntegers().stream().min(Comparator.comparing(i -> Math.abs(i - a)))
                .orElseThrow(() -> new NoSuchElementException("No value present"));
        System.out.println("Result search: " + result);
    }

    public void getAllRepository() {
        System.out.println("All list numbers: " + numbersRepository.getIntegers().toString());
    }
}
