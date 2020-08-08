package problemSolving;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find number of Employees Under every Employee
 * @Source: Microsoft Interview
 *
 * */
public class FindEmployeesUnderManager {

    static HashMap<String,Integer> result = new HashMap<>();

    public static void main(String[] args) {
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("A", "C");
        dataSet.put("B", "C");
        dataSet.put("C", "F");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("F", "F");

        populateResult(dataSet);
        System.out.println("result = " + result);
    }

    private static void populateResult(Map<String, String> dataSet) {

        HashMap<String, List<String>> managerEmpMap = new HashMap<>();

        for (Map.Entry<String,String> entry : dataSet.entrySet()) {
            String emp = entry.getKey();
            String manager = entry.getValue();

            if (!emp.equals(manager)) {
                List<String> empList = managerEmpMap.get(manager);
                if (empList == null) {
                    empList = new LinkedList<>();
                    managerEmpMap.put(manager,empList);
                }
                empList.add(emp);
            }
        }

        System.out.println(managerEmpMap);

        for (String emp: dataSet.keySet()) {
            populateResultUtils(emp,managerEmpMap);
        }

    }

    private static int populateResultUtils(String emp, HashMap<String, List<String>> managerEmpMap) {

        int count = 0;
        if (!managerEmpMap.containsKey(emp)) {
            result.put(emp,0);
             return 0;
        }

        if (result.containsKey(emp)) {
            count = result.get(emp);
        } else {
            List<String> empList = managerEmpMap.get(emp);
            count = empList.size();
            for (String currEmp: empList) {
                count += populateResultUtils(currEmp,managerEmpMap);
            }
            result.put(emp,count);
        }
        return count;
    }
}
