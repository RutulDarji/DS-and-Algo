package dataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : The Reversal Algorithm for Array Rotation
 * @Link : https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
 * */
public class ArrayRotationReversalAlgo {

    static void rotate(int array[], int d) {

        if(d==0) {
            return;
        }
        int n = array.length;
        swap(array,0,d-1);
        swap(array,d,n-1);
        swap(array,0,n-1);
    }

    static void swap(int array[],int start, int end) {

        int temp;
        while (start<end) {
            temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }

    }

    static void printArray(int array[]) {
        for (int curr: array) {
            System.out.print(curr+ " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 4;
        d = d % n;
        rotate(arr, d); // Rotate array by d
        printArray(arr);
    }

}
