package dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Author : Rutul Darji
 * @Description : Print Binary Numbers
 * @Link : https://www.geeksforgeeks.org/interesting-method-generate-binary-numbers-1-n/
 * */

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        int n=10;
        generatePrintBinary(n);
    }

    private static void generatePrintBinary(int n) {

        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        while (n-->0) {

            String s1 = queue.peek();
            queue.remove();
            System.out.println(s1);

            String s2 = s1;
            queue.add(s1+"0");
            queue.add(s2+"1");
        }


    }
}
