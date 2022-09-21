package Task13;

public class MainClass {
    public static void main(String[] args) {
        String[] expression = {"()",
                "[]",
                "{}",
                "(())",
                "([])",
                "{()}",
                "((()))",
                "([()])",
                "({[]})",
                "(",
                ")",
                ")(",
                "(()",
                "())",
                "{()",
                "([)]",
                "([(}])",
                "([{]})",
                "  "
        };

        CheckBrackets checkBrackets = new CheckBrackets();

        for (String e : expression) {
            System.out.printf("Expression: %-10s result: %s; \n", e, checkBrackets.checkBrackets(e));
        }
    }
}
