package Task3.project;

public class Correction {
    public static void textCorrection(String text) {
        System.out.println(text);

        text = text.replaceAll("pa", "po");

        System.out.println(text);
    }
}
