package HackerRank.interviewKit.stack;


import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Check Balanced Brackets . it contains {},(),[]
 * */

public class BalancedBrackets {

    static boolean checkBalancedBrackets(String str) {

        boolean result;
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);

            if (c == '{') {
                stack.push('}');
            }
            else if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.peek()!=c) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(str + " validation is: " + checkBalancedBrackets(str));
        str = "{[(])}";
        System.out.println(str + " validation is: " + checkBalancedBrackets(str));
        str = "{{[[(())]]}}";
        System.out.println(str + " validation is: " + checkBalancedBrackets(str));
    }
}
