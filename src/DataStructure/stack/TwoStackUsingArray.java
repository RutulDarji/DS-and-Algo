package DataStructure.stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Implement Two Stack using array
 * @Link : https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/
 * */
public class TwoStackUsingArray {

    int size;
    int top1,top2;
    int array[];

    TwoStackUsingArray(int size) {
        array = new int[size];
        this.size = size;
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if(top1<top2-1) {
            top1++;
            array[top1]=x;
        } else {
            System.out.println("OverFlow");
            System.exit(1);
        }
    }

    void push2(int x) {
        if(top1<top2-1) {
            top2--;
            array[top2]=x;
        } else {
            System.out.println("OverFlow");
            System.exit(1);
        }
    }

    int pop1() {
        if (top1>=0) {
            int x = array[top1];
            top1--;
            return x;
        }else {
            System.out.println("UnderFlow");
        }
        return Integer.MIN_VALUE;
    }

    int pop2() {
        if (top2<size) {
            int x = array[top2];
            top1++;
            return x;
        }else {
            System.out.println("UnderFlow");
        }
        return Integer.MIN_VALUE;
    }


    public static void main(String[] args) {
        TwoStackUsingArray stackUsingArray = new TwoStackUsingArray(5);
        stackUsingArray.push1(5);
        stackUsingArray.push2(10);
        stackUsingArray.push2(15);
        stackUsingArray.push1(11);
        stackUsingArray.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + stackUsingArray.pop1());
        stackUsingArray.push2(40);
        System.out.println("Popped element from"
                + " stack2 is " + stackUsingArray.pop2());

    }
}
