package dataStructure.stack;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Sort Stack using Recursion
 * @Link : https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
 * */
public class SortStackUsingRecursion {

    static void sortedStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            sortedStack(s);
            sortStackUtils(s,temp);
        }
    }

    private static void sortStackUtils(Stack<Integer> s, int temp) {

        if (s.isEmpty() || temp> s.peek()) {
            s.push(temp);
            return;
        }

        int top = s.pop();
        sortStackUtils(s, temp);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Stack elements before sorting: ");
        System.out.println(s);

        sortedStack(s);

        System.out.println("Stack elements after sorting:");
        System.out.println(s);

    }
}
