package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Separate Even and Odd numbers from Array
 * */
public class SeparateOddEvenNumbers {

    static int[] separateOddEvenNumbers(int array[]){

        int n =array.length;
        int left = 0;
        int right = n - 1;

        for (int i=0;i<n;i++) {
            while (array[left]%2==0) {
                left++;
            }
            while (array[right]%2!=0) {
                right--;
            }

            if (left<right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        return array;
    }

    static void printArray(int array[]) {
        for (int curr:array) {
            System.out.print(curr + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println("Before Separation");
        printArray(arr);
        System.out.println("After Separation");
        printArray(separateOddEvenNumbers(arr));
    }
}
