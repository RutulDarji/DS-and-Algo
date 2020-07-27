package problemSolving;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Longest Common Prefix...
 * */

public class LongestCommonPrefix {

    public static String getLongestCommonPrefixV2(String[] strArr) {
        if(strArr.length==0) return "";
        String minStr=getMinString(strArr);

        for (int i=minStr.length();i>=0;i--) {
            String temp = minStr.substring(0,i);
            int j;
            for (j=0;j<strArr.length;j++) {
                if (!strArr[j].startsWith(temp)) {
                    break;
                }
            }
            if (j==strArr.length) {
                return temp;
            }
        }
        return null;
    }

    public static String getMinString(String[] strArr)
    {
        String minStr=strArr[0];
        for(int i=1;i<strArr.length;i++){
            if(strArr[i].length()<minStr.length())
                minStr=strArr[i];
        }
        return minStr;
    }

    public static void main(String[] args) {
        String[] strArr={"java2blog","javaworld","javabean","javatemp"};
        String longestPrefix=getLongestCommonPrefixV2(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);

        String[] strArr1={"sqlblog","sql2world","sqlquery","sqlproc"};
        longestPrefix=getLongestCommonPrefixV2(strArr1);
        System.out.println("Longest Prefix : "+longestPrefix);

        String[] strArr2={"1sqlblog","2sql2world","3sqlquery","4sqlproc"};
        longestPrefix=getLongestCommonPrefixV2(strArr2);
        System.out.println("Longest Prefix : "+longestPrefix);
    }
}
