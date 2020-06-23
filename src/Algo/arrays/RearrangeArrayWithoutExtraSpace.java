package Algo.arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : Re arrang array in Max and Min order With O(1) space
 * @Link : https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form-set-2-o1-extra-space/
 * */

public class RearrangeArrayWithoutExtraSpace {
    public static void main(String args[])
    {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80};
        int n = arr.length;

        System.out.println("Original Array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        rearrange(arr, n);

        System.out.print("\nModified Array\n");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static void rearrange(int[] arr, int n) {

        int max_index = n-1;
        int min_index = 0;
        int max_element = arr[n-1] + 1;

        for (int i =0;i<n;i++) {

            if (i%2==0) {
                arr[i]+= (arr[max_index]%max_element) * max_element;
                max_index--;
            } else {
                arr[i]+= (arr[min_index]%max_element) * max_element;
                min_index++;
            }
        }

        for (int i=0;i<n;i++) {
            arr[i] = arr[i] / max_element;
        }


    }
}
