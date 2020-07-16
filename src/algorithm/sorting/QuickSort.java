package algorithm.sorting;

/**
 *
 * @Author : Rutul Darji
 * @Description : It picks an element as pivot and partitions the given array around the picked pivot
 * @Link : https://www.geeksforgeeks.org/quick-sort/
 * */
public class QuickSort {

    int partition(int array[],int low, int high) {

        // Taking last element as a pivot
        int pivot = array[high];
        int i = (low-1);

        for (int j=low;j<high;j++) {
            if (array[j]<pivot) {
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,high);
        return i+1;
    }

    void sort(int array[],int low,int high) {
        if (low<high) {
            int pi = partition(array,low,high);
            sort(array,low,pi-1);
            sort(array,pi+1,high);
        }
    }

    void swap(int array[],int src, int dest) {
        int temp = array[src];
        array[src] = array[dest];
        array[dest] = temp;
    }

    void printArray(int array[]) {
        for (int currElement: array) {
            System.out.print(currElement+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        ob.printArray(arr);
    }
}
