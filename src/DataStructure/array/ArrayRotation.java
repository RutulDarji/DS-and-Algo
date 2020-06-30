package DataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Rotate Array  (Approach: A Juggling Algorithm 0(N) )
 * @Link : https://www.geeksforgeeks.org/array-rotation/
 * */
public class ArrayRotation {


    int gcd(int a,int b) {
        if(b==0) {
            return a;
        }else {
            return gcd(b,a%b);
        }
    }

    void rotate(int array[],int d, int n) {
        d=d%n;
        int k,j,i,temp;
        int gcd = gcd(d,n);
        for (i=0;i<gcd;i++) {
            temp = array[i];
            j=i;
            while (true) {
                k=j+d;
                if(k>=n) {
                    k=k-n;
                }
                if (k==i) break;
                array[j]=array[k];
                j=k;
            }
            array[j]=temp;
        }

    }

    void printArray(int[] arr, int n) {

        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    public static void main(String[] args) {
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.rotate(arr, 9, 7);
        rotate.printArray(arr, 7);
    }

}
