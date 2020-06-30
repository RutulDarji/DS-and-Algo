package DataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Median of 2 sorted Array (Approach: Count While Merging 0(N) )
 * @Link : https://www.geeksforgeeks.org/median-of-two-sorted-arrays/
 * */
public class FindMedianOf2SortedArray {

    public int findMedian(int array1[], int array2[], int n) {

        int i=0,j=0;
        int m1=-1,m2=-1;

        for (int count =0;count<=n;count++) {

            // all element of array1 is less than first element of array2
            if(i==n) {
                m1=m2;
                m2=array2[0];
                break;
            } else if(j==n){  // all element of array2 is less than first element of array1
                m1=m2;
                m2=array1[0];
                break;
            } else if(array1[i]<=array2[j]) {
                m1=m2;
                m2 =array1[i];
                i++;
            } else {
                m1=m2;
                m2 =array2[j];
                j++;
            }
        }
        return (m1+m2)/2;
    }


    public static void main(String[] args) {
        FindMedianOf2SortedArray findMedianOf2SortedArray = new FindMedianOf2SortedArray();
        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 == n2)
            System.out.println("Median is " +
                    findMedianOf2SortedArray.findMedian(ar1, ar2, n1));
        else
            System.out.println("Can't not Fidn Median -> Both arrays must be of Same size!!");
    }

}
