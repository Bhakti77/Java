
//Stack - last in first out

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(23);
        stack.push(254);
        stack.push(23454);
        stack.push(243);
        stack.push(63);

        System.out.println(stack);

        System.out.println(stack.peek());

        int element = stack.pop(); //

        System.out.println(element);
        System.out.println(stack);

    }
}
