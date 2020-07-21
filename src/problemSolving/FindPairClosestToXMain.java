package problemSolving;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * */
public class FindPairClosestToXMain {

    public static void main(String[] args)
    {
        int array[]={-40,-5,1,3,6,7,8,20};
        findPairWithClosestToX(array,5);
    }

    public static void  findPairWithClosestToX(int arr[],int x) {

        Arrays.sort(arr);
        Integer min_sum = Integer.MAX_VALUE;
        int l =0 ;
        int r = arr.length - 1;
        int curr_sum = 0;
        int pair1stIndex = 0,pair2ndIndex = 0;

        while (l < r) {
            curr_sum = arr[l] + arr[r] - x;
            if (Math.abs(curr_sum) < Math.abs(min_sum)) {
                min_sum = curr_sum;
                pair1stIndex=l;
                pair2ndIndex=r;
            }
            if (arr[l] + arr[r] < x) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }
}
