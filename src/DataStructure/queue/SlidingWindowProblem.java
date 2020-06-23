package DataStructure.queue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowProblem {

    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 91 };
        int k = 3;
        printMax(arr, arr.length, k);
    }

    private static void printMax(int[] arr, int n, int k) {

        Deque<Integer> Qi = new LinkedList<>();

        int i;
        for (i=0;i<k;i++) {
            while (!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        for (;i<n;i++) {
            System.out.println(arr[Qi.peek()]+ " ");

            while (!Qi.isEmpty() && Qi.peek()<=i-k) {
                Qi.removeFirst();
            }

            while (!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);

        }
        System.out.println(arr[Qi.peek()]+ " ");
    }
}
