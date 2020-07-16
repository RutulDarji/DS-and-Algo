package dataStructure.array;

/**
 *
 * @Author : Rutul Darji
 * @Description : Write a program to print all the LEADERS in the array. An element is leader if it is greater than all
 * the elements to its right side. And the rightmost element is always a leader.
 * @Link : https://www.geeksforgeeks.org/leaders-in-an-array/
 * */

public class LeadersInArray {

    public void printLeaders(int arr[], int n) {

        int currMax = arr[n-1];
        System.out.print( currMax+ " ");

        for (int i=n-2;i>=0;i--) {
            if (currMax< arr[i]) {
                currMax = arr[i];
                System.out.print( currMax+ " ");
            }
        }


    }

    public static void main(String[] args) {
        LeadersInArray leadersInArray = new LeadersInArray();;
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        leadersInArray.printLeaders(arr, n);
    }
}
