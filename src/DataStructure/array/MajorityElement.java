package DataStructure.array;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Author : Rutul Darji
 * @Description : Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”.
 * A majority element in an array A[] of size n is an element that appears more than n/2 times
 * @Link : https://www.geeksforgeeks.org/majority-element/
 * */

public class MajorityElement {

    public static void findMajorityElement(int array[]) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<array.length;i++) {
            if (map.containsKey(array[i])) {
                int currCount = map.get(array[i]) + 1;
                if (currCount > array.length/2 ) {
                    System.out.println("Found Majority Element: " + array[i]);
                    return;
                } else {
                    map.put(array[i],currCount);
                }

            } else {
                map.put(array[i],1);
            }
        }
        System.out.println("Array Doesn't contain any majority element!!");
    }

    public static void main(String[] args) {
        int array[] = new int[]{2,2,2,2,5,5,2,3,3};

        findMajorityElement(array);
    }
}
