package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Check array elements are consecutive or not.
 *
 * */
public class ArrayConsecutiveElement {

     int findMinElement(int array[]) {
        int min = array[0];
        for (int i=1;i<array.length;i++) {
            if (array[i]<min) {
                min =array[i];
            }
        }
        return min;
    }

     int findMaxElement(int array[]) {
        int max = array[0];
        for (int i=1;i<array.length;i++) {
            if (array[i]>max) {
                max =array[i];
            }
        }
        return max;
    }

     boolean checkArrayIsConsecutive(int array[]) {

        if(array.length<1) {
            return false;
        }

        int min = findMinElement(array);
        int max = findMaxElement(array);
        int n = array.length;

        if (max-min+1 == n) {

            boolean validationArray[] = new boolean[n];

            for (int i=0;i<n;i++) {
                if (validationArray[array[i]-min]!=false) {
                    return false;
                }
                validationArray[array[i]-min]=true;
            }

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayConsecutiveElement consecutiveElement = new ArrayConsecutiveElement();
        int arr1[]= {47, 43, 45, 44, 46};
        System.out.println(consecutiveElement.checkArrayIsConsecutive(arr1)?"Consecutive Array":"Not  Consecutive Array");
        int arr2[] = {5, 3, 4, 1, 2};
        System.out.println(consecutiveElement.checkArrayIsConsecutive(arr2)?"Consecutive Array":"Not  Consecutive Array");
        int arr3[] = {6, 7, 5, 6};
        System.out.println(consecutiveElement.checkArrayIsConsecutive(arr3)?"Consecutive Array":"Not  Consecutive Array");
    }

}
