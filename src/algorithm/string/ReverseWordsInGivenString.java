package algorithm.string;

import java.util.Arrays;

/**
 * @Author: Rutul Darjo
 * @Link : https://www.geeksforgeeks.org/reverse-words-given-string-java/
 * */

public class ReverseWordsInGivenString {

    public static void main(String[] args)
    {
        String s1 = "Welcome.to.geeksforgeeks";
        System.out.println(reverseWords(s1));

        String s2 = "I.love.Java.Programming";
        System.out.println(reverseWords(s2));
    }

    private static String reverseWords(String str) {
        String[] temp = str.split("\\.");
        System.out.println(Arrays.toString(temp));
        String result = "";

        // Iterate over the temp array and store
        // the Algo.string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = "." + temp[i] + result;
        }
        return result;
    }
}
