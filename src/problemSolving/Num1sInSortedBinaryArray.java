package problemSolving;


/**
 *
 * @Author : Rutul Darji
 * @Description : Count 1's in Sorted Array..
 * Approach : logarithmic time i.e. with a worst time complexity of O(log n).
 * */
public class Num1sInSortedBinaryArray {

    static int count1s(int array[],int start, int end) {

        // if first element is 1 then all remaining is 1
        if (array[start]==1) {
            return end-start+1;
        }

        // if last element is 0 then no 1
        if (array[end]==0) {
            return 0;
        }

        int mid = (start+end)/2;
        int leftSideCount = count1s(array,start,mid);
        int rightSideCount = count1s(array,mid+1,end);
        return (leftSideCount+rightSideCount);
    }


    public static void main(String[] args) {
        int[] arr1 = {0,0,0,1,1,1,1};
        int[] arr2 = {0,0,1};
        int[] arr3 = {0,0,0,0,0};

        System.out.println("Count: "+ count1s(arr1,0,arr1.length-1));
        System.out.println("Count: "+ count1s(arr2,0,arr2.length-1));
        System.out.println("Count: "+ count1s(arr3,0,arr3.length-1));
    }
}
