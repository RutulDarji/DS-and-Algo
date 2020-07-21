package problemSolving;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find a Pair Whose Sum is Closest to zero in Array
 * */
public class findPairClosestToZero {

    public static void main(String[] args)
    {
        int array[]={1,30,-5,70,-8,20,-40,60};
        findPairWithMinSumBruteForce(array);
        findPairWithMinSum(array);
    }

    public static void  findPairWithMinSum(int arr[]) {

        Arrays.sort(arr);
        Integer min_sum = Integer.MAX_VALUE;
        int l =0 ;
        int r = arr.length - 1;
        int curr_sum = 0;
        int pair1stIndex = 0,pair2ndIndex = 0;

        while (l < r) {
            curr_sum = arr[l] + arr[r];
            if (Math.abs(curr_sum) < Math.abs(min_sum)) {
                min_sum = curr_sum;
                pair1stIndex=l;
                pair2ndIndex=r;
            }
            if (curr_sum<0) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }



    public static void  findPairWithMinSumBruteForce(int arr[])
    {
        if(arr.length<2)
            return;
        // Suppose 1st two element has minimum sum
        int minimumSum=arr[0]+arr[1];
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempSum=arr[i]+arr[j];
                if(Math.abs(tempSum) < Math.abs(minimumSum))
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumSum=tempSum;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to zero using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }
}
