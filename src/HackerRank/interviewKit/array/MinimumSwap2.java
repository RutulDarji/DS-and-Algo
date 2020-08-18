package HackerRank.interviewKit.array;

/**
 *
 * @Author : Rutul Darji
 *
 * */
public class MinimumSwap2 {

    static int swappingCount(int arr[]) {
        int swapCount = 0;
        int n = arr.length - 1;

        for (int i=0;i<n;i++) {
            if (i < arr[i]-1) {
                swap(arr,i,Math.min(n,arr[i]-1));
                swapCount++;
                i--;
            }
        }

        return swapCount;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int array1[] = {4 ,3 ,1 ,2};
        int array2[] = {2 ,3 ,4 ,1 ,5};
        int array3[] = {1 ,2 ,5 ,3 ,4 ,6 ,7};

        System.out.println("Swapping Count: " + swappingCount(array1));
        System.out.println("Swapping Count: " + swappingCount(array2));
        System.out.println("Swapping Count: " + swappingCount(array3));

    }
}
