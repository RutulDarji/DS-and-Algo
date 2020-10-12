package CrackingCodingInterview.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : Rutul Darji
 * @Description : Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 * dictionary words.
 * @Approach: There should be only one odd char
 * */
public class PalindromePermutation {


    static boolean checkForPalindromePermutationString(String input) {

        Map<Character,Integer> map = new HashMap<>();
        int countOddChar = 0;

        for (Character character: input.toCharArray()) {
            if (!Character.isSpaceChar(character)) {
                if (map.containsKey(character)) {
                    map.put(character,map.get(character)+1);
                } else {
                    map.put(character,1);
                }
            }
        }

        System.out.println(map);

        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            if (entry.getValue()%2==1) {
                countOddChar++;
            }
            if (countOddChar>1) {
                return false;
            }
        }


        return true;
    }



    public static void main(String[] args) {
        String input1 = "Tact Coa";
        System.out.println(input1 + " is: " + checkForPalindromePermutationString(input1.toLowerCase()));
    }
}
