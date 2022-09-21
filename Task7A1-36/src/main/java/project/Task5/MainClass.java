package project.Task5;

public class MainClass {
    public static void main(String[] args) {
        LengthService lengthService = (a, b) -> {
            if (a.length() > b.length()) {
                return a;
            } else {
                return b;
            }
        };

        String str1 = "Ukraine";
        String str2 = "Dnipro";
        System.out.println(lengthService.whoISLonger(str1, str2));
    }
}
