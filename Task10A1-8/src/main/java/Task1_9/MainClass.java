package Task1_9;

public class MainClass {
    public static void main(String[] args) {
        String text = TextService.readFromFile("Text.txt");
        System.out.println(text);
        TextService.deleteSubstring(text, "he");
        TextService.replaceSubstring(text, "and", "java");
        TextService.findVowelLatter(text);
        TextService.sameLetter(text);
        TextService.findMaxNumbers(text);
        TextService.countWord(text);
        TextService.capitalizeFirstLetter(text);
    }
}
