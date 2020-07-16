package dataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Java program to print largest contiguous array sum
 * @Link : https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * */

public class LargestSumContiguousSubArray {

    public void printMaxSubArray(int array[]) {
        int max_so_far = Integer.MIN_VALUE,max_ending_here = 0,start = 0, end =0, s=0;

        for (int i=0;i<array.length;i++) {
            max_ending_here = max_ending_here + array[i];

            if (max_so_far<max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i+1;
            }
        }

        System.out.println("Max Sum : "+ max_so_far + " with starting index: " + start +
                " with ending index: " + end);

    }

    public static void main(String[] args) {
        LargestSumContiguousSubArray largestSumContiguousSubArray = new LargestSumContiguousSubArray();
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        largestSumContiguousSubArray.printMaxSubArray(a);
    }
}
