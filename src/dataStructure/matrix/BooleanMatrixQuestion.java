package dataStructure.matrix;

import java.util.Arrays;

public class BooleanMatrixQuestion {

    static void makeBooleanMatrix(int matrix[][],int row,int col) {

        int rowArray[] = new int[row];
        int colArray[] = new int[col];

        Arrays.fill(rowArray,0);
        Arrays.fill(colArray,0);

        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (matrix[i][j] == 1) {
                    rowArray[i] = 1;
                    colArray[j] = 1;
                }
            }
        }

        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (rowArray[i]==1 || colArray[j]==1) {
                    matrix[i][j]=1;
                }
            }
        }

    }

    public static void printMatrix(int matrix[ ][ ], int R, int C)
    {
        int i, j;
        for (i = 0; i < R; i++)
        {
            for (j = 0; j < C; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[ ][ ] = { {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0},};

        System.out.println("Before Boolean Matrix ");
        printMatrix(mat, 3, 4);
        makeBooleanMatrix(mat, 3, 4);
        System.out.println("After Boolean Matrix");
        printMatrix(mat, 3, 4);
    }
}
