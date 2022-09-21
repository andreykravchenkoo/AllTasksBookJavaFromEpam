package Task5.project;

public class AddWord {
    public static String addWord(String text, String substring, String word) {
        System.out.println(text);
        String[] arrayString = text.trim().split("\\s+");
        String result = new String();

        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].endsWith(substring) || arrayString[i].endsWith(substring + ",")) {
                result += arrayString[i].concat(" " + word + " ");
            } else {
                result += arrayString[i].concat(" ");
            }
        }

        return result;
    }
}
