import java.util.*;

public class Test {

    public static Integer addBinaryNumber(Integer firstNum, Integer secondNum) {
        StringBuilder output = new StringBuilder();
        int carry = 0;
        int temp;
        while (firstNum != 0 || secondNum != 0) {
            temp = (firstNum % 10 + secondNum % 10 + carry) % 2;
            System.out.println("temp: "+ temp);
            output.append(temp);

            carry = (firstNum % 10 + secondNum % 10 + carry) / 2;
            firstNum = firstNum / 10;
            secondNum = secondNum / 10;
        }
        if (carry != 0) {
            output.append(carry);
        }
        return Integer.valueOf(output.reverse().toString());
    }

    public static void main(String[] args) {

//        System.out.println(addBinaryNumber(1011,1011));

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task performed on: " + new Date() + " n " +
                        " Thread's name: " + Thread.currentThread().getName());
                System.exit(0);
            }
        };

        Timer timer = new Timer("Timer");

        long delay = 1000L;
        timer.schedule(timerTask, delay);
        /*

        String geoCode = "BH,EG,IR,IQ,JO,KW,LB,OM,PS,QA,SA,SY,TR,AE,YE,DZ,TN,MA";
        String rmmGeoValue = "DZ,BH,TD,DJ,EG,IR,IQ,JO,KW,LB,LY,MR,MA,OM,PS,QA,SA,SO,ZA,SD,SY,TN,AE,YE";

        String[] geoCodeArray = geoCode.split(",");

        Map<String,Boolean> geoCodeMap = new HashMap<>();

        for (String geo:geoCodeArray) {
            geoCodeMap.putIfAbsent(geo,false);
        }

        geoCodeMap.forEach((geo, flag) -> {
            if (rmmGeoValue.toLowerCase().contains(geo.toLowerCase())) {
                geoCodeMap.put(geo,true);
            }
        } );

        geoCodeMap.forEach((geo, flag) -> {
            System.out.println("Key -> " + geo + " Value -> " + flag);
        } );

        boolean result = true;

        for (Map.Entry<String,Boolean> entry : geoCodeMap.entrySet()) {
            if (!entry.getValue()) {
                result = false;
                break;
            }
        }

        System.out.println("result " +result);

         */
    }
}