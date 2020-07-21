package problemSolving;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : Sort 0,1,2 with 0(N)
 * */
public class sort012 {

    static void sort012(int array[]) {

        int sortedArray[] = new int[3];
        Arrays.fill(sortedArray,0);

        for (int i=0;i<array.length;i++) {
            if (!(array[i]>=0 && array[i]<=2)) {
                System.out.println("Array Doesn't Contain Valid Element");
                return;
            }
            sortedArray[array[i]]++;
        }

        int j=0;
        for (int i=0;i<sortedArray.length;i++) {
            for (int k=0;k<sortedArray[i];k++) {
                array[j++]=i;
            }
        }

        printArray(array);
    }

    static void printArray(int array[]) {
        for (int curr:array) {
            System.out.print(curr + " ");
        }
    }

    public static void main(String[] args) {
        int[]a = {1,0,2,0,0,1,2,2,1,1,1,2,2};
        sort012(a);
    }
}
