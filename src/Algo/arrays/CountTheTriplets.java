package Algo.arrays;

public class CountTheTriplets {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(countWays(arr, n));
    }

    // need to consider 4 cases
    private static int countWays(int[] arr, int n) {
        int ans = 0;

        // first find the max element
        int max_value = 0;
        for (int i =0;i<arr.length;i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
            }
        }
        System.out.println("MAx value: " + max_value);
        // made freq as per array
        int[] freq = new int[max_value+1];
        for (int i = 0; i < n; i++)
            freq[arr[i]]++;

        // 1) all 0 : (0,0,0)
        // in that case f(x)C3
        ans += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6;

        // 2) one zero (0,x,x)
        // in that case start for 1 to max value and check f(0) * f(x)C2

        for (int i = 1; i <= max_value; i++)
            ans += freq[0] * freq[i] * (freq[i] - 1) / 2;

        // 3) (x,x,2x)
        // in that case start for 1 to max value and check  f(x)C2 * f(2*x)
        for (int i = 1; 2 * i <= max_value; i++)
            ans += freq[i] * (freq[i] - 1) / 2 * freq[2 * i];


        // 3) (x,y,x+y)
        // in that case start for 1 to max value and check  f(x) * f(y) * f(x+y)
        for (int i = 1; i <= max_value; i++) {
            for (int j = i + 1; i + j <=  max_value; j++)
                ans += freq[i] * freq[j] * freq[i + j];
        }
        return ans;
    }
}
