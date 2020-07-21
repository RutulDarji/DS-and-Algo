package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find subarrays with given sum in an array
 * */
public class TargetsumSubarr {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        solveEfficient(arr,9);
    }

    public static void solveEfficient(int[] arr, int target) {
        int start = 0, end = 0;
        int currSum = 0;

        while (start < arr.length && end <= arr.length) {
            if (currSum == target) {

                System.out.println("starting index : " + start + ", " +
                        "Ending index : " + (end - 1));

                if (end <= arr.length - 1) {
                    System.out.println("cuurent sum :" + currSum);
                    currSum += arr[end];
                }
                end++;

            } else {
                if (currSum > target) {
                    currSum -= arr[start];
                    start++;
                } else {
                    if (end <= arr.length - 1) {
                        currSum += arr[end];
                    }
                    end++;
                }
            }
        }
    }
}
