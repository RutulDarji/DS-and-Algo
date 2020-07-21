package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClimbingLeaderboard {

    static int getRank(int array[],int current) {

        List<Integer> integers = new ArrayList<>();
        Arrays.stream(array).distinct().forEach(integers::add);

        int index = Collections.binarySearch(integers,current,Collections.reverseOrder());

        if (index<0) {
            return Math.abs(index);
        } else {
            return index+1;
        }
    }

    public static void main(String[] args) {

        int array[] = {100,90,90,80,75,60};
        int ranks[] = {50,65,77,90,102};

        for (int i=0;i<ranks.length;i++) {
            System.out.println(getRank(array,ranks[i]));
        }


    }
}
