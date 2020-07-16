package dataStructure.stack;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Reverse Stack Using Recursion. using call blocks
 * @Link : https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
 * */
public class ReverseStackUsingRecusrion {

    static Stack<Integer> stack = new Stack<>();

    static void reverse() {
        if (stack.size()>0) {
            int x = stack.peek();
            stack.pop();
            reverse();
            insertAtBottom(x);
        }
    }

    static void insertAtBottom(int x) {

        if (stack.isEmpty()) {
            stack.push(x);
        } else {
            int a = stack.peek();
            stack.pop();
            insertAtBottom(x);
            stack.push(a);
        }
    }


    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack");
        System.out.println(stack);

        reverse();

        System.out.println("Reversed Stack");
        System.out.println(stack);
    }
}
