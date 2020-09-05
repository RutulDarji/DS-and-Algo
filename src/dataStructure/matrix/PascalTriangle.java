package dataStructure.matrix;

/**
 *
 * @Author: Rutul Darji
 * @Description : LRU cache implementation with LinkedHashSet
 * */
public class PascalTriangle {

    public static void printPascalTriangle(int n) {

        int pascalMatrix[][] = new int[n][n];

        for (int line=0;line<n;line++) {

            for (int i=0;i<=line;i++) {
                if (i==0 || i==line) {
                    pascalMatrix[line][i]=1;
                } else {
                    pascalMatrix[line][i] = pascalMatrix[line-1][i] + pascalMatrix[line-1][i-1];
                }
                System.out.print(pascalMatrix[line][i]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascalTriangle(6);
    }
}
