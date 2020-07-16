package algorithm.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSumWithNegative {

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int n = arr.length;
        int sum = -10;
        subArraySum(arr, n, sum);
    }

    private static void subArraySum(int[] arr, int n, int sum) {

        int start = 0;
        int end = -1;
        int curr_sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <n ; i++) {
            curr_sum = curr_sum+ arr[i];

            if (curr_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(curr_sum - sum)) {
                start = map.get(curr_sum - sum) + 1;
                end = i;
                break;
            }
            map.put(curr_sum,i);
        }

        if (end == -1) {
            System.out.println("No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes "
                    + start + " to " + end);
        }
    }

}
