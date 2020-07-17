package HackerRank.algorithm;

/**
 *
 * @Author : Rutul Darji
 * @Description : Drawing Book Problem from Hackerrank Algo Practise
 * */
public class DrawingBook {

    static int movePagesCount(int totalPage, int targetPage) {

        int startFromBeginning = targetPage/2;
        int startFromEnding;

        if (totalPage%2==0) {
            startFromEnding = (totalPage - targetPage)/2;
        } else {
            startFromEnding = (int)Math.ceil((totalPage - targetPage)/2.0);
        }

        return Math.min(startFromBeginning,startFromEnding);

    }

    public static void main(String[] args) {
        System.out.println("Min files require "+ movePagesCount(6,2));
        System.out.println("Min files require "+ movePagesCount(5,4));
    }
}
