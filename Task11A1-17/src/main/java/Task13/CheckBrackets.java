package Task13;

import java.util.Stack;

public class CheckBrackets {
    boolean checkBrackets(String expression) {
        boolean correct;
        Stack<Character> stack = new Stack<>();

        if (correct = expression != null) {

            for (char symbol : expression.toCharArray()) {

                if (symbol == '(' || symbol == '[' || symbol == '{') {
                    stack.push(symbol);
                } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                    if (stack.empty()) {
                        correct = false;
                        break;
                    } else {
                        char bracket = stack.pop();

                        if (!checkReverseBracket(bracket, symbol)) {
                            correct = false;
                            break;
                        }
                    }
                }
            }
            correct = correct && stack.empty();
        }

        return correct;
    }

    private boolean checkReverseBracket(char on, char off) {
        return (on == '(' && off == ')' || on == '[' && off == ']' || on == '{' && off == '}');
    }
}
