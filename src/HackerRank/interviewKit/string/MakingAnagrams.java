package HackerRank.interviewKit.string;

import java.util.HashMap;

/**
 *
 * @Author : Rutul Darji
 * @Description : Count no of elements to delete to make String anagram
 * */
public class MakingAnagrams {

    static int makeStringAnagram(String a,String b) {
        int diff = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for (Character input: a.toCharArray()) {
            map.put(input,map.getOrDefault(input,0)+1);
        }

        for (Character input: b.toCharArray()) {
            if (!map.containsKey(input) || map.get(input)==0) {
                diff++;
            } else {
                map.put(input,map.get(input)-1);
            }
        }

        for (Character input: map.keySet()) {
            diff += map.get(input);
        }

        return diff;
    }

    public static void main(String[] args) {
        System.out.println("count to make anagram: " + makeStringAnagram("cde","abc"));
    }

}
