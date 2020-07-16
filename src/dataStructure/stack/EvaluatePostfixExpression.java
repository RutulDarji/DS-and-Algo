package dataStructure.stack;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Evaluate Postfix Expression for Single and multiple digit
 * @Link : https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/
 * */
public class EvaluatePostfixExpression {

    static int evaluateForSingleDigitNumbers(String exp) {

        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c-'0');
            } else {
               int num1 = stack.pop();
               int num2 = stack.pop();
               evaluateUtil(stack,num1,num2,c);
            }
        }
        return stack.pop();
    }

    static void evaluateUtil(Stack<Integer> stack, int num1, int num2, int c) {
        switch(c)
        {
            case '+':
                stack.push(num2+num1);
                break;

            case '-':
                stack.push(num2- num1);
                break;

            case '/':
                stack.push(num2/num1);
                break;

            case '*':
                stack.push(num2*num1);
                break;
        }
    }


    static int evaluateForMultipleDigitNumbers(String exp) {

        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            if(c == ' ') {
                continue;
            } else if(Character.isDigit(c)) {
                int n=0;

                while (Character.isDigit(c)) {
                    n = n*10 + (int)(c-'0');
                    i++;
                    c = exp.charAt(i);
                }
                i--;
                stack.push(n);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                evaluateUtil(stack,num1,num2,c);
            }

        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp="231*+9-";
        System.out.println("postfix evaluation: "+evaluateForSingleDigitNumbers(exp));

        String exp2 = "100 200 + 2 / 5 * 7 +";
        System.out.println("postfix evaluation: "+evaluateForMultipleDigitNumbers(exp2));
    }

}
