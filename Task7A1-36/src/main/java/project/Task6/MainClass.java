package project.Task6;

public class MainClass {
    public static void main(String[] args) {
        DiscriminantService discriminantService = (a, b, c) -> {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            return discriminant;
        };

        System.out.println(discriminantService.discriminant(6.9, -3.4, 8.1));
    }
}
