package dataStructure.matrix;

import java.util.HashSet;

/**
 *
 * @Author: Rutul Darji
 * @Description : Print Unique Rows of Matrix
 * */
public class PrintUniqueRows {


    static void printUniqueRows(int arr[][],int row,int col) {

        HashSet<String> hashSet = new HashSet<>();

        for (int i=0;i<row;i++) {

            String s = "";

            for (int j=0;j<col;j++) {
                s+=String.valueOf(arr[i][j]);
            }

            if (!hashSet.contains(s)) {
                hashSet.add(s);
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {
        int arr[][] = { {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0} };

        printUniqueRows(arr, 4, 5);
    }
}
