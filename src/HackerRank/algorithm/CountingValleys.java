package HackerRank.algorithm;

/**
 *
 * @Author : Rutul Darji
 * @Description : Counting Valleys Problem from Hackerrank Algo Practise
 * */
public class CountingValleys {

    static int countValleys(String str) {

        int cnt= 0;
        int valley = 0;

        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);

            // curve
            if (cnt == -1 && c == 'U') {
                valley++;
            }

            if(c == 'U') {
                cnt++;
            } else {
                cnt--;
            }

        }

        return valley;
    }

    public static void main(String[] args) {
        String str1 = "UDDDUDUU";
        System.out.println("Valleys count : "+ countValleys(str1));

        String str2 = "DDUUDDUDUUUD";
        System.out.println("Valleys count : "+ countValleys(str2));
    }
}
