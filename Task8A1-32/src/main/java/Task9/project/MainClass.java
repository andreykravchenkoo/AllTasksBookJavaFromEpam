package Task9.project;

public class MainClass {
    public static void main(String[] args) {
        String text = "All general-purpose map implementation classes should provide two \"standard\" constructors: " +
                "a void (no arguments) constructor which creates an empty map, and a constructor with a single " +
                "argument of type Map, which creates a new map with the same key-value mappings as its argument. " +
                "In effect, the latter constructor allows the user to copy any map, producing an equivalent map " +
                "of the desired class. There is no way to enforce this recommendation (as interfaces cannot " +
                "contain constructors) but all of the general-purpose map implementations in the JDK comply.";

        TextOperation.countWord(text);
    }
}
