package dataStructure.matrix;

public class SpriralForm {

    static void printSpiralForm(int row,int col,int matrix[][]) {

        int rowStart=0;
        int rowEnd = row;
        int colStart = 0;
        int colEnd = col;


        while (rowStart<rowEnd && colStart<colEnd) {

            //print first row
            for (int i=colStart;i<colEnd;i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // print last column
            for(int i=rowStart;i<rowEnd;i++) {
                System.out.print(matrix[i][colEnd-1]+ " ");
            }
            colEnd--;

            if (rowStart<rowEnd) {
                for (int i=colEnd-1;i>=colStart;i--) {
                    System.out.print(matrix[rowEnd-1][i]+ " ");
                }
                rowEnd--;
            }

            if (colStart<colEnd) {
                for (int i=rowEnd-1;i>=rowStart;i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }



        }


    }


    public static void main(String[] args) {
        int R = 3;
        int C = 6;
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        printSpiralForm(R, C, a);
    }
}
