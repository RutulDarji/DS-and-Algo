package DataStructure.stack;


import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Infix to Postfix conversion O(N)
 * @Link : https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
 * */
public class InfixToPostfixConverter {

    static int getPrecedence(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfixConverter(String exp) {

        String result = new String();
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<exp.length();i++) {

            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result+=c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                // remove element upto you found '('
                while (!stack.isEmpty() && stack.peek()!='(') {
                    result+=stack.pop();
                }

                if (!stack.empty() && stack.peek()!='(') {
                    return "Invalid Expression";
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && getPrecedence(c)<=getPrecedence(stack.peek())) {
                    if (stack.peek()=='(') {
                        return "Invalid Expression";
                    }
                    result+=stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            result+=stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfixConverter(exp));
        exp = "a+b*(c^d-e)^(f+g*h)-i(";
        System.out.println(infixToPostfixConverter(exp));
    }
}
