package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : provide a starting and ending value describing a range of integers.
 * Sherlock must determine the number of square integers within that range,
 * inclusive of the endpoints.
 * */
public class SherlockAndSquares {

    static int countSquare(int a,int b) {
        int count = 0;

        for (int i=(int)Math.sqrt(a);i<=Math.sqrt(b);i++) {
            if (i*i>=a && i*i<=b) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Squre count: " + countSquare(24,49));
    }
}
