package Task5;

import java.util.Stack;

public class StackService {
    public static void swapStack(Stack<String> stack1, Stack<String> stack2) {
        Stack<String> stack3 = new Stack<>();
        stack3.addAll(stack1);
        stack1.clear();
        stack1.addAll(stack2);
        stack2.clear();
        stack2.addAll(stack3);
    }
}
