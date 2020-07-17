package algorithm.arrays;

/**
 * @Author: Rutul Darji
 * @Link : https://www.geeksforgeeks.org/insertion-sort/
 * */

public class InsertionSort {

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

    private void sort(int[] arr) {

        int n = arr.length;

        for(int i=1;i<n;i++) {
            int key = arr[i];
            int j= i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}