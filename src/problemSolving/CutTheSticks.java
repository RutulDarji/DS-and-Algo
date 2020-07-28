package problemSolving;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @Author : Rutul Darji
 * @DescriptionLink: https://www.hackerrank.com/challenges/cut-the-sticks/problem
 * */
public class CutTheSticks {

    static void cutTheSticks(List<Integer> list) {
        List<Integer> temp;
        while (list.size()>0) {
            temp = new LinkedList<>();
            System.out.println(list.size());
            int min = Collections.min(list);
            for (int curr: list) {
                if (curr > min) {
                    temp.add(curr - min);
                }
            }
            list = temp;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(8);
        cutTheSticks(list);
    }
}
