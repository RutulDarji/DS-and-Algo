package algorithm.sorting;

/**
 *
 * @Author : Rutul Darji
 * @Description : The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 *                from unsorted part and putting it at the beginning O(n*n)
 * @Link : https://www.geeksforgeeks.org/selection-sort/
 * */
public class SelectionSort {

    void sort(int array[]) {
        int n = array.length;

        for (int i=0;i<n-1;i++) {
            int min_index = i;
            for (int j=i+1;j<n;j++) {
                if(array[min_index]>array[j]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i]= temp;
        }

    }

    void printArray(int array[]) {
        for (int currElement: array) {
            System.out.print(currElement+ " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
