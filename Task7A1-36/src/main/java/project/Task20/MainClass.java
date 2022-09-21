package project.Task20;

public class MainClass {
    public static void main(String[] args) {
        Factory factory = (a) -> {
            int i = 1;
            int fact = 1;
            for (i = 1; i <= a; i++) {
                fact = fact * i;
            }

            System.out.println("Numbers: " + a + ", fact: " + fact);
        };

        factory.factory(5);
    }
}
