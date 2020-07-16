package algorithm.sorting;

/**
 *
 * @Author : Rutul Darji
 * @Description : Insertion sort is a simple sorting algorithm that works the way
 *                  we sort playing cards in our hands.. O(n*n)
 * @Link : https://www.geeksforgeeks.org/insertion-sort/
 * */
public class InsertionSort {

    void insertionSort(int array[]) {

        int n = array.length;
        int key,j;

        for (int i=1;i<n;i++) {
            key = array[i];
            j=i-1;

            while(j>=0 && array[j]>key) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }

    void printArray(int array[]) {
        for (int currElement: array) {
            System.out.print(currElement+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 33, 15, 0 };

        InsertionSort ob = new InsertionSort();
        ob.insertionSort(arr);

        ob.printArray(arr);
    }

}
