package HackerRank.interviewKit.stack;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Skyline Real Estate Developers is planning to demolish a number of old,
 *                unoccupied buildings and construct a shopping mall in their place.
 *                Your task is to find the largest solid area in which the mall can be constructed.
 * */
public class LargestRectangle {


    long largestRectangle(int h[]) {
        long max = 0;
        long top_max = 0;
        int i = 0;
        int n = h.length;
        Stack<Integer> stack = new Stack<>();


        while(i<n) {
            // check for current greater
            if (stack.isEmpty() || h[stack.peek()] <= h[i]) {
                stack.push(i++);
            } else {
                // if less then found the max up to that point
                int top = stack.peek();
                stack.pop();

                if (stack.isEmpty()) {
                    top_max = h[top] * i;
                } else {
                    // each step , greater point is consider and evaluated..
                    top_max = h[top] * (i-1-stack.peek());
                }

                if (top_max > max) {
                    max = top_max;
                }

            }
        }

        while (!stack.isEmpty()) {
            int top = stack.peek();
            stack.pop();

            if (stack.isEmpty()) {
                top_max = h[top] * i;
            } else {
                // each step , greater point is consider and evaluated..
                top_max = h[top] * (i-1-stack.peek());
            }

            if (top_max > max) {
                max = top_max;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LargestRectangle largestRectangle = new LargestRectangle();
        int array []= {1,2,2,4,5};
        System.out.println("Largest rectangle value: "+ largestRectangle.largestRectangle(array));
    }

}
