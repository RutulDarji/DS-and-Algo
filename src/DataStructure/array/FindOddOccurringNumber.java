package DataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Java program to find the element occurring odd  number of times
 * @Link : https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 * */

public class FindOddOccurringNumber {

    public static int findOddOccurringNumber(int array[]) {
        int result = 0;
        for(int i=0;i<array.length;i++) {
            result = result ^ array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        System.out.println(findOddOccurringNumber(arr));
    }
}
