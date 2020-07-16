package algorithm.sorting;

/**
 *
 * @Author : Rutul Darji
 * @Description : Bubble Sort is the simplest sorting algorithm that works by repeatedly
 *                swapping the adjacent elements if they are in wrong order. O(n*n)
 * @Link : https://www.geeksforgeeks.org/bubble-sort/
 * */
public class BubbleSort {

    void bubbleSort(int array[]) {
        int n = array.length;
        boolean swap;

        for (int i=0;i<n-1;i++) {
            swap = false;

            for (int j=0;j<n-i-1;j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                    swap = true;
                }
            }

            if (swap == false) {
                break;
            }

        }



    }

    void printArray(int array[]) {
        for (int currElement: array) {
            System.out.print(currElement+ " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted array: ");
        bubbleSort.printArray(arr);
    }
}
