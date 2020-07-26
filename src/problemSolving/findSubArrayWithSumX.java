package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Largest subArray With Sum X
 * */
public class findSubArrayWithSumX {

    public static void findSubArraySumEqualToXOptimized(int arr[], int X) {
        int currentSum = arr[0];
        int start = 0;

        for (int i = 1; i <= arr.length; i++) {
            while (currentSum > X && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == X) {
                int endIndexForContArray = i - 1;
                System.out.println("Sum found between indexes " + start + " and " + endIndexForContArray);
                System.out.println("Printing Array values : ");
                for (int j = start; j <= endIndexForContArray; j++) {
                    System.out.print(arr[j] + " ");
                }
                return;
            }

            // Add this element to currentSum
            if (i < arr.length)
                currentSum = currentSum + arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        findSubArraySumEqualToXOptimized(arr,33);
    }
}
