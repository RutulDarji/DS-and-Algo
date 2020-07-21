package problemSolving;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : Minimum number of platforms required for a railway station
 * */
public class TrainPlatform {

    static int findRequiredPlatform(int arrival[],int departure[]) {

        int max_platform_count = 0, curr_platform_count = 0;

        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0,j = 0;
        int n =arrival.length;

        while (i < n && j < n) {

            // pickup from arrival then increment the count
            if (arrival[i] < departure[j]) {
                i++;
                curr_platform_count++;
                if(max_platform_count<curr_platform_count) {
                    max_platform_count = curr_platform_count;
                }
            } else {
                // pickup from departure then deincrement the count
                j++;
                curr_platform_count--;
            }
        }
        return max_platform_count;
    }


    public static void main(String[] args) {
        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 210, 230,315, 600};
        System.out.println("Minimum platforms needed: "+findRequiredPlatform(arr,dep));
    }
}
