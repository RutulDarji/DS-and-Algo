package HackerRank.interviewKit.stack;
/**
 *
 * @Author : Rutul Darji
 *
 * */
public class FraudulentActivityNotifications {

    static int activityNotifications(int[] expenditure, int d) {
        int[] count = new int[201];
        int ans = 0 ;

        for(int i=0;i<d;i++) {
            count[expenditure[i]]++;
        }

        for (int i=d;i<expenditure.length;i++) {
            int median = findMedian(count,d);

            if (median<=expenditure[i]) {
                ans++;
            }
            count[expenditure[i-d]]--;
            count[expenditure[i]]++;
        }

        return ans;
    }

    static int findMedian(int count[],int d) {
        int sum = 0;

        for(int i=0;i<count.length;i++) {
            sum+=count[i];

            if ((2*i)==d) {
                return (2*i+1);
            } else if((2*i)>d) {
                return (2*i);
            }
        }

        return 1;
    }

    public static void main(String[] args) {

        int array1[] = {1 ,2 ,3 ,4 ,4};
        int d1 = 4;
        System.out.println("Notification: " + activityNotifications(array1,d1));

        int array2[] = {2 ,3 ,4 ,2 ,3 ,6 ,8 ,4 ,5};
        int d2 = 5;
        System.out.println("Notification: " + activityNotifications(array2,d2));

    }
}
