package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Min Element in Sorted Rotated Array..
 * */
public class FindMinInSortedRotatedArray {

    static int findMin(int array[],int low,int high) {

        int mid;
        while(low<high)
        {
            mid=low + ((high - low) / 2);
            if(array[mid] > array[high])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        int arr[]={16,19,21,25,1,2,3,8,10};
        System.out.println("Minimum element in the array : "+findMin(arr,0,arr.length-1));
    }
}
