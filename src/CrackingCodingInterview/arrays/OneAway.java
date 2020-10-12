package CrackingCodingInterview.arrays;

/**
 * @Author : Rutul Darji
 * @Description : There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character. Given two strings,
 * write a function to check if they are one edit (or zero edits) away
 * */
public class OneAway {

    boolean isOneEditAway(String first,String second) {

        if (first.length() == second.length()) {
            return oneEditReplace(first,second);
        } else if(first.length()+1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() -1 == second.length()) {
            return oneEditInsert(second,first);
        }
        return false;
    }

    boolean oneEditReplace(String first,String second) {
        boolean foundDiff = false;
        for (int i=0;i<first.length();i++) {
            if (first.charAt(i)!=second.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }

    boolean oneEditInsert(String s1,String s2) {
        int index1=0;
        int index2=0;

        while (index1<s1.length() && index2<s2.length()) {
            if (s1.charAt(index1)!=s2.charAt(index2)) {
                if (index1!=index2) {
                    return false;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    public static void main(String[] args) {
        OneAway object = new OneAway();
        String input1="pale";
        String input2="ple";
        System.out.println(input1 + " " + input2 + " -> " + object.isOneEditAway(input1,input2));

        input1="pales";
        input2="pale";
        System.out.println(input1 + " " + input2 + " -> " + object.isOneEditAway(input1,input2));

        input1="pale";
        input2="bale";
        System.out.println(input1 + " " + input2 + " -> " + object.isOneEditAway(input1,input2));

        input1="pale";
        input2="bae";
        System.out.println(input1 + " " + input2 + " -> " + object.isOneEditAway(input1,input2));

    }


}
