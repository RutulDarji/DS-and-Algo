package HackerRank.interviewKit.string;

import java.util.HashSet;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find all Permutation of given String..
 * */
public class FindAllPermutation {
    static HashSet<String> strings = new HashSet<>();

    static void printAllPermutation(String str, String ans) {

        if (str.length() == 0) {
            strings.add(ans);
            System.out.println(ans + " ");
            return;
        }

        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0,i) + str.substring(i+1);
            printAllPermutation(ros,ans+ch);
        }
    }


    public static void main(String[] args) {
        String s = "abb";
        printAllPermutation(s, "");
        System.out.println("Unique Permutation: "+ strings);
    }
}
