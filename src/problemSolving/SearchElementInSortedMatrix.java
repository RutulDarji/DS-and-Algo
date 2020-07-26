package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : find Element in Sorted Matrix. Matrix is sorted Row and Column wise.
 * */
public class SearchElementInSortedMatrix {


    static void findElementInSortedMatrix(int sortedMatrix[][],int X) {

        int R = sortedMatrix.length;
        int C = sortedMatrix[0].length;
        int r = 0;
        int c = C-1;

        while (r<=R-1 && c>=0) {
            if (X == sortedMatrix[r][c]) {
                System.out.println("Element " + X + " Found at sortedMatrix[" + r + "][" + c + "]");
                return;
            } else if(X<sortedMatrix[r][c]) {
                c--;
            } else if (X>sortedMatrix[r][c]) {
                r++;
            }
        }

        System.out.println("Element " + X + " Not Found");
    }

    public static void main(String[] args) {
        int[][] sortedMatrix =
                {
                    { 1, 6, 10, 12, 20 },
                    { 4, 8, 15, 22, 25 },
                    { 5, 20, 35, 37, 40 },
                    { 10, 28, 38, 45, 55 }
                };

        findElementInSortedMatrix(sortedMatrix,37);
    }
}
