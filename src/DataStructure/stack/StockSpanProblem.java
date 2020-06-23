package DataStructure.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Stock Span Problem with Stack O(N)
 * @Link : https://www.geeksforgeeks.org/the-stock-span-problem/
 * */

public class StockSpanProblem {

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);
    }

    private static void printArray(int[] s) {
        System.out.print(Arrays.toString(s));
    }

    private static void calculateSpan(int[] price, int n, int[] s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        s[0]=1;

        for (int i=1;i<n;i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            s[i]= (stack.isEmpty()) ? i+1 : (i-stack.peek());
            stack.push(i);
        }
    }
}
