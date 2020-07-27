package problemSolving;

import java.math.BigInteger;

/**
 *
 * @Author : Rutul Darji
 * @Description : Calculate Long Factorial
 *
 * */
public class ExtraLongFactorial {

    static void calculateFactorial(int n) {
        BigInteger integer = new BigInteger("1");

        for (int i=2;i<=n;i++) {
            integer = integer.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n +"! --> " + integer);

    }

    public static void main(String[] args) {
        calculateFactorial(20);
        calculateFactorial(10);
        calculateFactorial(30);
    }
}
