package Algo.sorting;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : We can use binary search to reduce the number of comparisons in normal insertion sort.
 *                Binary Insertion Sort uses binary search to find the proper location to insert the
 *                selected item at each iteration.
 *                In normal insertion sort, it takes O(n^2) comparisons(at nth iteration) in worst case.
 *                We can reduce it to O(log n) by using binary search.
 * @Link : https://www.geeksforgeeks.org/binary-insertion-sort/
 * */
public class BinaryInsertionSort {

    void binaryInsertionSort(int array[]) {

        for(int i=1;i<array.length;i++) {
            int x = array[i];
            //find insertion position
            int j = Math.abs(Arrays.binarySearch(array,0,i,x) +1);
            System.arraycopy(array,j,array,j+1,i-j);
            array[j]=x;
        }

    }

    void printArray(int array[]) {
        for (int currElement: array) {
            System.out.print(currElement+ " ");
        }
    }

    public static void main(String[] args) {

        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        final int[] arr = {37, 23, 0, 17, 12, 72, 31,
                46, 100, 88, 54 };
        binaryInsertionSort.binaryInsertionSort(arr);
        binaryInsertionSort.printArray(arr);
    }

}
