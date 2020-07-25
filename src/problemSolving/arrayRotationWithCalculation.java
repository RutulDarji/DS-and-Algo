package problemSolving;

public class arrayRotationWithCalculation {

    int[] rotate(int array[],int k,int n) {
        int array2[] = new int[n];

        k = k%n;

        for (int i=0;i<n;i++) {
            int m = i;

            if (m-k>=0) {
                array2[i] = array[m-k];
            } else {
                array2[i] = array[n+m-k];
            }
        }
        return array2;
    }

    void printArray(int array[]) {
        for (int curr: array) {
            System.out.print(curr + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        arrayRotationWithCalculation arrayRotationWithCalculation = new arrayRotationWithCalculation();
        int arr1 [] = {1,2,3,4,5,6,7,8,9,10};
        int result[] = arrayRotationWithCalculation.rotate(arr1,13,arr1.length);
        System.out.println("Before Rotation");
        arrayRotationWithCalculation.printArray(arr1);
        System.out.println("After Rotation");
        arrayRotationWithCalculation.printArray(result);
    }

}
