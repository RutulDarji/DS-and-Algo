package Algo.string;

public class PermutationOfGivenString {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        PermutationOfGivenString permutation = new PermutationOfGivenString();
        permutation.permute(str, 0, n - 1);
    }

    private void permute(String str, int l, int r) {
        if(l==r) {
            System.out.println(str);
        } else {
            for(int i=l;i<=r;i++) {
                str = swap(str, l, i);
                permute(str,l+1,r);
                str = swap(str, l,i);
            }
        }
    }

    private String swap(String str, int l, int i) {

        char temp;
        char[] stringArray = str.toCharArray();
        temp = stringArray[i];
        stringArray[i] = stringArray[l];
        stringArray[l] = temp;
        return String.valueOf(stringArray);
    }
}
