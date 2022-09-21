package Task9.project;

public class MainClass {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt "
                + "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
                + "nisi ut aliquip ex ea commodo consequat.";

        StringAlignUtils stringAlignUtils = new StringAlignUtils(50, StringAlignUtils.Alignment.RIGHT);
        System.out.println(stringAlignUtils.format(text));
    }
}
