package HackerRank.interviewKit.stack;

import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Make Queue Using 2 stack... Making Pop operation costly..
 * */
public class QueuesTaleOfTwoStacks {

    Stack<Integer> newStack = new Stack<>();
    Stack<Integer> oldStack = new Stack<>();

    void enqueue(Integer data) {
        newStack.push(data);
    }

    Integer dequeue() {
        prepareOldestStack();
        return oldStack.pop();
    }

    Integer peek() {
        prepareOldestStack();
        return oldStack.peek();
    }

    private void prepareOldestStack() {
        if (oldStack.isEmpty()) {
            while (! newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
    }


    public static void main(String[] args) {
        QueuesTaleOfTwoStacks q = new QueuesTaleOfTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
