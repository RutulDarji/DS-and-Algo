package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Solution for: https://www.hackerrank.com/challenges/append-and-delete/problem
 *
 * */
public class AppendAndDelete {

    public static boolean solve(String s,String t,int k) {

        if (k>=s.length()+t.length()) {
            return true;
        }

        for (int i=s.length();;i--) {
            String temp = s.substring(0,i);
            if (t.startsWith(temp)) {
                int diff = (s.length() - i) + (t.length() - i);
                return diff<=k && (k-diff)%2==0;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(solve("hackerhappy","hackerrank",9));
        System.out.println(solve("aba","aba",7));
        System.out.println(solve("ashley","ash",2));
    }
}
