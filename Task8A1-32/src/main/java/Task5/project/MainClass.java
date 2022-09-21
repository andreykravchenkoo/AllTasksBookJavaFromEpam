package Task5.project;

public class MainClass {
    public static void main(String[] args) {
        String text = "После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово";
        String result = AddWord.addWord(text, "а", "iqos");
        System.out.println(result);
    }
}
