package Task22.project;

public class MainClass {
    public static void main(String[] args) {
        String text = "package Task8.poject;\n" +
                "\n" +
                "import java.util.regex.Pattern;\n" +
                "\n" +
                "public class MainClass {\n" +
                "    public static void main(String[] args) {\n" +
                "        TextService textService = (text) -> {\n" +
                "            System.out.println(text);\n" +
                "            Pattern pattern = Pattern.compile(\"\\\\([^)]+\\\\)\");\n" +
                "            String result = text.replaceAll(String.valueOf(pattern), \"\");\n" +
                "            System.out.println(result);\n" +
                "        };\n" +
                "\n" +
                "        //wrewrwerewrwe//\n" +
                "        /*45345435*/\n" +
                "        /**eqwqeqw**/\n" +
                "\n" +
                "        String text = \"Andrey smoke (iqos) everyday \";\n" +
                "        textService.deletePartText(text);\n" +
                "    }\n" +
                "}\n";

        System.out.println(text);

        text = text.replaceAll("(/\\*((.|\\n)*?)\\*/)|//.*", "");

        System.out.println(text);
    }
}
