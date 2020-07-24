package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
 *                Max profit can be gain by buying on 1st day(0 based indexing) and sell on the 4th day.
 *                Max profit = 99-12 =87Check array elements are consecutive or not.
 *
 * */
public class StockBuySell {

    static int findMaxProfit(int array[]) {

        int lowestProfitDay = array[0];
        int maxProfit = Integer.MIN_VALUE;
        int currProfit;
        int n = array.length;

        for(int i=0;i<n;i++) {
            if (array[i]>lowestProfitDay) {
                currProfit = array[i]-lowestProfitDay;
                maxProfit = Math.max(currProfit,maxProfit);
            } else {
                lowestProfitDay = array[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
        System.out.println("Maximum profit : " + findMaxProfit(arr));
        int arr1[] = { 14, 2, 70, 15, 99, 65, 21, 90 };
        System.out.println("Maximum profit : " + findMaxProfit(arr1));
    }
}
