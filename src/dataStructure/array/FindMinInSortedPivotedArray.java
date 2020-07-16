package dataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Search Min element in a sorted and rotated array
 * @Link : https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
 * */
public class FindMinInSortedPivotedArray {

    public static int findMin(int array[],int low,int high) {

        // if array is not rotated
        if(high<low) {
            return array[0];
        }

        if(low==high) {
            return array[low];
        }

        int mid = low + (high-low)/2;

        // check mid+1 < mid : for case [3, 4, 5, 1, 2]
        if(high > mid && array[mid+1]<array[mid]) {
            return array[mid+1];
        }

        if(mid > low && array[mid-1]>array[mid]) {
            return array[mid];
        }


        // if last element is greater than mid then search in left side
        if(array[high]>array[mid]) {
            return findMin(array,low,mid-1);
        }

        return findMin(array,mid+1,high);
    }


    public static void main(String[] args) {
        int arr1[] =  {5, 6, 1, 2, 3, 4};
        int n1 = arr1.length;
        System.out.println("The minimum element is "+ findMin(arr1, 0, n1-1));

        int arr2[] =  {0, 2, 3, 4};
        int n2 = arr2.length;
        System.out.println("The minimum element is "+ findMin(arr2, 0, n2-1));

        int arr3[] =  {1};
        int n3 = arr3.length;
        System.out.println("The minimum element is "+ findMin(arr3, 0, n3-1));

        int arr7[] =  {1, 2, 3, 4, 5, 6, 7};
        int n7 = arr7.length;
        System.out.println("The minimum element is "+ findMin(arr7, 0, n7-1));
    }
}
