package project.Task2;

public class MainClass {
    public static void main(String[] args) {
        AnagramCreate anagramCreate = new AnagramCreate();

        String wordFirst = "andrey";
        String wordSecond = "ynerad";

        System.out.println(anagramCreate.anagram(wordFirst, wordSecond));
    }
}
