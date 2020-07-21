package problemSolving;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : Given an array of integers, find and print the maximum number of integers you can
 * select from the array such that the absolute difference between any two of the chosen integers is
 * less than or equal to 1
 * */
public class PickingNumbers {


    static void findMaxLengthArray(int array[]) {

        int maxCount = 0;
        int currCount;

        if (array.length > 0 ) {
            Arrays.sort(array);

            for (int i=0;i<array.length-1;i++) {
                currCount = 0;

                for (int j=i;j<array.length;j++) {
                    if (Math.abs(array[i]-array[j])<=1) {
                        currCount++;
                    } else {
                        break;
                    }
                }

                if (maxCount<currCount) {
                    maxCount = currCount;
                }

            }
            System.out.println("Max count is: "+ maxCount);
        }
    }


    public static void main(String[] args) {

        int array1[] = {4,6,5,3,3,1};
        findMaxLengthArray(array1);

        int array2[] = {};
        findMaxLengthArray(array2);

        int array3[] = {1,2,2,3,1,2};
        findMaxLengthArray(array3);

    }
}
