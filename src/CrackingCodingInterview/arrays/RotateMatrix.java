package CrackingCodingInterview.arrays;

/**
 * @Author : Rutul Darji
 * @Description :  Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * */
public class RotateMatrix {

    static void rotate(int matrix[][]) {
        if (matrix.length== 0 || matrix.length != matrix[0].length) return;

        int n = matrix.length;
        for (int layer=0;layer<n/2;layer++) {
            int first = layer;
            int last = n-1-layer;

            for (int i=first;i<last;i++) {
                int offset = i-first;
                // top
                int top = matrix[first][i];
                // left -> top
                matrix[first][i] = matrix[last-offset][first];
                // bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];
                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        final int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Before Rotation");
        printMatrix(matrix);
        rotate(matrix);
        System.out.println("After Rotation");
        printMatrix(matrix);


    }
}
