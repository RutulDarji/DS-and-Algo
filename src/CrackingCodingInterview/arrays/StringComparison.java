package CrackingCodingInterview.arrays;

/**
 * @Author : Rutul Darji
 * @Description :  Implement a method to perform basic string compression using the counts of repeated
 * characters. For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string. You can assume the string has only
 * uppercase and lowercase letters (a - z).
 * */
public class StringComparison {

    static String compress(String inputString) {

        StringBuilder compressedString = new StringBuilder();
        int consecutiveCount = 0;

        for (int i=0;i<inputString.length();i++) {
            consecutiveCount++;

            if (i+1 >= inputString.length() || inputString.charAt(i)!=inputString.charAt(i+1)) {
                compressedString.append(inputString.charAt(i));
                compressedString.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        return compressedString.length() < inputString.length() ? compressedString.toString() : inputString;
    }

    public static void main(String[] args) {
        String inputString = "aabcccccaaa";
        System.out.println(inputString + " compressed -> " + compress(inputString) );

        inputString = "abcdefg";
        System.out.println(inputString + " compressed -> " + compress(inputString) );
    }
}
