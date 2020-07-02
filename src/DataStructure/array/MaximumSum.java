package DataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Given an array of positive numbers, find the maximum sum of a subsequence with the constraint
 *                  that no 2 numbers in the sequence should be adjacent in the array
 * @Link : https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 * */
public class MaximumSum {

    static int findMaxSum(int array[],int n) {
        int incl = array[0];
        int excl = 0;
        int excl_new;

        for(int i=1;i<n;i++) {
            excl_new = (incl>excl)?incl:excl;
            incl = excl+ array[i];
            excl = excl_new;
        }

        return (incl>excl)? incl: excl;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{50, 5, 10, 100, 10, 5};
        System.out.println(findMaxSum(arr, arr.length));
    }
}
