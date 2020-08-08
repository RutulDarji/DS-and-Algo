package problemSolving;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Duplicate at K distance present or not
 *
 * */
public class FindItinerary {

    public static void main(String[] args) {
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");

        printResult(dataSet);
    }

    private static void printResult(Map<String, String> dataMap) {

        HashMap<String,String> reverseDataMap = new HashMap<>();

        for (Map.Entry<String,String> entry: dataMap.entrySet()) {
            reverseDataMap.put(entry.getValue(),entry.getKey());
        }

        String start = null;
        for (Map.Entry<String,String> entry: dataMap.entrySet()) {
            if (!reverseDataMap.containsKey(entry.getKey())) {
                start = entry.getKey();
            }
        }


        if (start==null) {
            System.out.println("Invalid Input!!");
            return;
        }

        String to = dataMap.get(start);
        while (to!=null) {
            System.out.println(start + " --> " + to);
            start = to;
            to = dataMap.get(start);
        }
    }
}
