package dataStructure.stack;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {

    Stack<Integer> min = new Stack<>();

    void push(int x) {

        if (isEmpty()==true) {
            super.push(x);
            min.push(x);
        } else {
            super.push(x);
            int y = min.peek();

            if (x<y) {
                min.push(x);
            } else {
                min.push(y);
            }
        }
    }

    public Integer pop() {
        int x = super.pop();
        min.pop();
        return x;
    }

    public Integer getMin() {
        return min.peek();
    }



    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(10);
        specialStack.push(20);
        specialStack.push(30);
        System.out.println(specialStack.getMin());
        specialStack.push(5);
        System.out.println(specialStack.getMin());
    }

}
