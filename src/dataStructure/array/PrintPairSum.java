package dataStructure.array;

import java.util.HashSet;

/**
 *
 * @Author : Rutul Darji
 * @Description : Given an array A[] and a number x, check for pair in A[] with sum as x.
 * @Link : https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 * */

public class PrintPairSum {

    public static void printPairWithGivenSum(int array[],int sum) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0;i<array.length;i++) {
            int temp = sum - array[i];

            if (hashSet.contains(temp)) {
                System.out.println("Pair with Given sum: " + sum + " is[ " + array[i] + " , " + temp + " ]");
            }
            hashSet.add(array[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 4, 45, 6, 10, 8 };
        int n = 17;
        printPairWithGivenSum(array, n);
    }
}
