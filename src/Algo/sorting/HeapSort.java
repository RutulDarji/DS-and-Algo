package Algo.sorting;

/**
 *
 * @Author : Rutul Darji
 * @Description : Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 *                It is similar to selection sort where we first find the maximum element and place
 *                the maximum element at the end. We repeat the same process for remaining element.
 * @Link : https://www.geeksforgeeks.org/heap-sort/
 * */
public class HeapSort {

    void sort(int array[]) {

        int n = array.length;

        // build heap
        for(int i=n/2-1;i>=0;i--) {
            heapify(array,n,i);
        }

        //delete first element and recursively make heap
        for (int i=n-1;i>0;i--) {
            int swap = array[0];
            array[0]=array[i];
            array[i]=swap;
            heapify(array,i,0);
        }


    }

    void heapify(int array[],int n ,int i) {

        int largest = i;
        int left = 2*i+1; // left child
        int right = 2*i+2; // right child


        if(left<n && array[left] > array[largest]) {
            largest = left;
        }

        if(right<n && array[right] > array[largest]) {
            largest = right;
        }

        if(largest!=i) {
            int swap = array[i];
            array[i]=array[largest];
            array[largest]=swap;
            heapify(array,n,largest);
        }
    }

    void printArray(int array[]) {
        for (int currElement: array) {
            System.out.print(currElement+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        ob.printArray(arr);
    }
}
