package problemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Author : Rutul Darji
 * */

public class FindPairEqualToGivenNumberMain {

    public static void main(String[] args) {
        int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
        findPairsEqualsToX(array, 15);
        System.out.println();
        findPairsEqualsToXWithHashing(array,15);
    }

    private static void findPairsEqualsToXWithHashing(int[] array, int x) {
        int n = array.length;
        if (n < 2) {
            return;
        }

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            map.put(array[i],i);
        }

        for (int i=0;i<n;i++) {
            if (map.get(x-array[i])!=null && map.get(x-array[i])!=i) {
                System.out.println( "[ " +array[i] + " : " + (x-array[i]) + " ]");
            }
        }
    }

    private static void findPairsEqualsToX(int[] array, int x) {
        int n = array.length;
        if (n < 2) {
            return;
        }

        Arrays.sort(array);
        int l = 0;
        int r = n -1;
        int sum = 0;

        while (l < r) {
            sum = array[l] + array[r];
            if(sum == x) {
                System.out.println( "[ " +array[l] + " : " + array[r] + " ]");
                l++;
                r--;
            } else if (sum < x){
                l++;
            } else {
                r--;
            }
        }
    }
}
