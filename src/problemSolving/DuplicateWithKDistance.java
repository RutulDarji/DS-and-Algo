package problemSolving;

import java.util.HashSet;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Duplicate at K distance , present or not
 *
 * */
public class DuplicateWithKDistance {

    static boolean checkDuplicatesWithinK(int array[],int distance) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<array.length;i++) {
            if (hashSet.contains(array[i])) {
                return true;
            }
            hashSet.add(array[i]);

            if (i>=distance) {
                hashSet.remove(array[i-distance]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 2, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
