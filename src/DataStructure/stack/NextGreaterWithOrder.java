package DataStructure.stack;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Next Greater Number In Order with 0(N) time and 0(N) space complexity
 * @Link : https://www.geeksforgeeks.org/next-greater-element-in-same-order-as-input/
 * */
public class NextGreaterWithOrder {

    static void nextGreater(int arr[], int n) {

        int arr1[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--) {
            if (!stack.isEmpty() && stack.peek()<=arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                arr1[i]=-1;
            } else {
                arr1[i]=stack.peek();
            }
            stack.push(arr[i]);
        }

        for (int i=0;i<n;i++) {
            System.out.println(arr[i]+" --> " + arr1[i]);
        }
    }


    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        nextGreater(arr, n);
    }

}
