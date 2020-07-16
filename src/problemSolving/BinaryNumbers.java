package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Working With Binary Numbers
 * */
public class BinaryNumbers {


    Integer convertDecimalToBinary(Integer decimal) {
        if (decimal == 0) {
            return decimal;
        }

        int rem = 0;
        StringBuilder result = new StringBuilder();

        while (decimal>0) {

            rem = decimal%2;
            result.append(rem);
            decimal = decimal/2;
        }

        result = result.reverse();
        return Integer.parseInt(result.toString());
    }

    Integer convertBinaryToDecimal(Integer binary) {

        Integer result = 0;
        Integer base = 1;

        while (binary>0) {
            Integer rem = binary%10;
            result+=rem*base;
            binary = binary/10;
            base*=2;
        }
        return result;
    }

    Integer addBinaryNumbers(Integer num1,Integer num2) {

        StringBuilder result = new StringBuilder();

        Integer temp;
        Integer carry=0;
        while (num1!=0 || num2!=0) {
            temp = (num1%10+num2%10+carry)%2;
            carry = (num1%10+num2%10+carry)/2;
            result.append(temp);
            num1/=10;
            num2/=10;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return Integer.parseInt(result.reverse().toString());
    }

    Integer getOnesComplement(Integer num) {
        StringBuilder result = new StringBuilder();
        Integer rem;

        while (num>0) {
            rem = num%10;

            if (rem ==0 ){
                result.append(1);
            } else if(rem == 1) {
                result.append(0);
            }

            num =num/10;
        }
        return Integer.parseInt(result.reverse().toString());
    }

    Integer substractBinaryNumber(Integer num1, Integer num2) {

        StringBuilder result = new StringBuilder();
        int onesComplement = Integer.valueOf(getOnesComplement(num2));

        Integer temp;
        Integer carry=0;
        while (num1!=0 || onesComplement!=0) {
            temp = (num1%10+onesComplement%10+carry)%2;
            carry = (num1%10+onesComplement%10+carry)/2;
            result.append(temp);
            num1/=10;
            onesComplement/=10;
        }

        String finalResult =  result.reverse().toString();
        if (carry == 1) {
            return addBinaryNumbers(Integer.parseInt(finalResult),carry);
        } else {
            return getOnesComplement(Integer.parseInt(finalResult));
        }
    }


    public static void main(String[] args) {
        BinaryNumbers binaryNumbers = new BinaryNumbers();

        Integer decimalNumber =6;
        System.out.println("Binary of Number: "+ decimalNumber +" is: "+ binaryNumbers.convertDecimalToBinary(decimalNumber));

        Integer binaryNumber = 110;
        System.out.println("Decimal of Number: "+ binaryNumber +" is: "+ binaryNumbers.convertBinaryToDecimal(binaryNumber));

        Integer num1= 100;
        Integer num2= 111;
        System.out.println("Sum of num1 and num2: " + binaryNumbers.addBinaryNumbers(num1,num2));

        System.out.println("Subtraction of num2 and num1: " + binaryNumbers.substractBinaryNumber(num2,num1));
    }
}
