package Task5;

import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        stack1.add("Ukraine");
        stack1.add("Dnipro");
        stack1.add("Kyiv");

        stack2.add("England");
        stack2.add("London");
        stack2.add("Chelsy");

        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);

        StackService.swapStack(stack1, stack2);

        System.out.println("Stack after swap: ");
        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
    }
}
