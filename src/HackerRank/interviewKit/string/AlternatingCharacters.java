package HackerRank.interviewKit.string;

/**
 *
 * @Author : Rutul Darji
 * @Description : https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 * */
public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int duplicates = 0;

        if (s!=null && s.length() ==0) {
            return duplicates;
        }

        for (int i=0;i<s.length()-1;i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                duplicates++;
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println("count: " + alternatingCharacters("AAAA"));
        System.out.println("count: " + alternatingCharacters("BBBBB"));
        System.out.println("count: " + alternatingCharacters("ABABABAB"));
        System.out.println("count: " + alternatingCharacters("BABABA"));
        System.out.println("count: " + alternatingCharacters("AAABBB"));
    }
}
