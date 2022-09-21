package project.Task10;

public class MainClass {
    public static void main(String[] args) {
        MoreNumberService moreNumberService = (a, b, c) -> {
            if (a > b || a > c) {
                System.out.println(a);
            } else if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        };

        moreNumberService.moreNumber(5, 8, 200);
    }
}
