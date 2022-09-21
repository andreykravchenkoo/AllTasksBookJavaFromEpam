package project;

public class MainClass {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int numbersArray [] = {1, 42, 34, 2, 324};
        String strArray [] = {"Hello", "Fine", "Ukraine"};

        methods.multiplicationTable();
        System.out.println("");
        methods.reverseArray(numbersArray);
        System.out.println("");
        methods.reverseArray(strArray);
        System.out.println("");
        methods.divisibleThree();
        System.out.println("");
        methods.month();

    }
}
