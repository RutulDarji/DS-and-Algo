package DataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : There are two sorted arrays. First one is of size m+n containing only m elements.
 *                Another one is of size n and contains n elements.
 *                Merge these two arrays into the first array of size m+n such that the output is sorted.
 * @Link : https://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/
 * */
public class MergeArrayInMplusN {

    public void moveElementsToEnd(int array[], int size) {
        int j=size-1;

        for(int i=size-1;i>=0;i--) {
            if (array[i]!=-1) {
                array[j]=array[i];
                j--;
            }
        }
    }

    public void merge(int mPlusN[],int N[],int m,int n) {

        int i=n;
        int j=0;
        int k=0;

        while(k<(m+n)) {

            if ((i < (m + n) && mPlusN[i] <= N[j]) || (j == n)) {
                mPlusN[k]=mPlusN[i];
                i++;
            } else {
                mPlusN[k]=N[j];
                j++;
            }
            k++;
        }
    }

    void printArray(int array[]) {
        for (int curr: array) {
            System.out.print(curr+ " ");
        }
    }



    public static void main(String[] args) {
        MergeArrayInMplusN mergeArrayInMplusN = new MergeArrayInMplusN();
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 30};
        int n = N.length;
        int m = mPlusN.length - n;

        /*Move the m elements at the end of mPlusN*/
        mergeArrayInMplusN.moveElementsToEnd(mPlusN, m + n);

        /*Merge N[] into mPlusN[] */
        mergeArrayInMplusN.merge(mPlusN, N, m, n);

        /* Print the resultant mPlusN */
        mergeArrayInMplusN.printArray(mPlusN);
    }

}
