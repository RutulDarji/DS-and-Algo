package DataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Search an element in a sorted and rotated array
 * @Link : https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 * */

public class SearchInSortedPivotedArray {

    static int search(int array[],int l,int h, int key) {

        if(l>h) {
            return -1;
        }

        int mid = (l+h)/2;

        if(array[mid] == key) {
            return mid;
        }

        // check first half is sorted or not
        if(array[l]<=array[mid]) {

            // check in [l...mid]
            if(key>=array[l] && key<=array[mid]) {
                return search(array,l,mid-1,key);
            }
            // check in [mid...h]
            return search(array,mid+1,h,key);
        }

        // if first half is not sorted then 2nd half must be sorted..
        // check in [mid...h]
        if(key>=array[mid] && key<=array[h]){
            return search(array,mid+1,h,key);
        }
        // check in [l...mid]
        return search(array,l,mid-1,key);
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 9;
        int i = search(arr, 0, n-1, key);
        if (i != -1)
            System.out.println("Found at Index: " + i);
        else
            System.out.println("Key not found!!");
    }
}
