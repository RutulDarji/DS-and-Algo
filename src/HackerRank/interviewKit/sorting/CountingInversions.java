package HackerRank.interviewKit.sorting;

import java.util.Arrays;

/**
 *
 * @Author : Rutul Darji
 * @Description : count no of elements where i < j and arr[i]>arr[j]
 * */
public class CountingInversions {

    static long mergeSortAndCount(int arr[],int l,int r) {
        long count= 0;

        if (l < r) {
            int mid = (l+r)/2;
            count+= mergeSortAndCount(arr,l,mid);
            count+= mergeSortAndCount(arr,mid+1,r);
            count+=mergeAndCount(arr,l,mid,r);
        }

        return count;
    }

    private static long mergeAndCount(int[] arr, int l, int mid, int r) {

        long swap = 0;
        int left[] = Arrays.copyOfRange(arr,l,mid+1);
        int right[] = Arrays.copyOfRange(arr,mid+1,r+1);

        int i=0,j=0,k=l;

        while (i<left.length && j<right.length) {
            if (left[i]<=right[j]) {
                arr[k++]=left[i++];
            } else {
                arr[k++]=right[j++];
                swap+=(mid+1)-(l+i);
            }
        }

        while (i<left.length) {
            arr[k++]=left[i++];
        }

        while (j<right.length) {
            arr[k++]=right[j++];
        }

        return swap;
    }


    public static void main(String[] args) {
        int array1[] = {1 ,1 ,1 ,2 ,2 };
        System.out.println("Inversion Count: "+ mergeSortAndCount(array1,0,array1.length-1));

        int array2[] = {2 ,1 ,3 ,1 ,2};
        System.out.println("Inversion Count: "+ mergeSortAndCount(array2,0,array2.length-1));

    }
}
