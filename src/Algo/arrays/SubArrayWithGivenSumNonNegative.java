package Algo.arrays;

/*
* Complexity Analysis:
    Time Complexity : O(n). Only one traversal of the array is required. So the time complexity is O(n).
    Space Complexity: O(1), constant extra space is required.
*
* */

public class SubArrayWithGivenSumNonNegative {

    public static void main(String[] args) {

        SubArrayWithGivenSumNonNegative subArrayWithGivenSumNonNegative = new SubArrayWithGivenSumNonNegative();
        int arr[] = {1,2,3,7,5};
        int n = arr.length;
        int sum = 12;
        subArrayWithGivenSumNonNegative.subArraySum(arr, n, sum);
    }

    private void subArraySum(int[] arr, int n, int sum) {

        if (n>=0) {
            int curr_sum = arr[0];
            int start = 0;

            for(int i=1;i<n;i++) {
                while (curr_sum>sum && start < i-1) {
                    curr_sum = curr_sum - arr[start];
                    start++;
                }

                if (curr_sum == sum) {
                    int p = i-1;
                    System.out.println("Find Sum between : " + start + " and " + p);
                    return;
                }

                if (i<n) {
                    curr_sum = curr_sum + arr[i];
                }
            }

            System.out.println("Sum " + sum + " is not present in this array");
        } else {
            System.out.println("Invalid Input");
        }
    }


}
