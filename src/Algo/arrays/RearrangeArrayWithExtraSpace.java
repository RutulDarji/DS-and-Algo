package Algo.arrays;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : Re arrang array in Max and Min order With O(N) space
 * @Link : https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/
 * */

public class RearrangeArrayWithExtraSpace {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));
        RearrangeArrayWithExtraSpace obj = new RearrangeArrayWithExtraSpace();
        arr = obj.rearrange(arr,arr.length);

        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }

    private int[] rearrange(int[] arr, int length) {

        int max_index = length-1;
        int min_index = 0;
        boolean flag = true;
        int temp[] = new int[length];

        for (int i=0;i<length;i++) {

            if (flag) {
                temp[i] = arr[max_index--];
            } else {
                temp[i] = arr[min_index++];
            }
            flag = !flag;
        }
        return temp;
    }
}
