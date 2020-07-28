package problemSolving;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Sort Stack using another stack (Ascending, Descending Order)
 * */
public class SortStackUsingAnotherStack {

    static Stack<Integer> sortStackInAscendingOrder(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            while (!temp.isEmpty() && temp.peek() > curr) {
                stack.push(temp.pop());
            }
            temp.push(curr);
        }
        return temp;
    }

    static Stack<Integer> sortStackInDescendingOrder(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            while (!temp.isEmpty() && temp.peek() < curr) {
                stack.push(temp.pop());
            }
            temp.push(curr);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(60);
        stack.push(40);
        stack.push(30);

        Stack<Integer> stack1 = (Stack<Integer>) stack.clone();

        System.out.println(stack);

        Stack<Integer> ascendingOrderStack = sortStackInAscendingOrder(stack);
        System.out.println(ascendingOrderStack);

        Stack<Integer> descendingOrderStack = sortStackInDescendingOrder(stack1);
        System.out.println(descendingOrderStack);

    }
}
