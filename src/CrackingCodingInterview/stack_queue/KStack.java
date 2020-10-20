package CrackingCodingInterview.stack_queue;

/**
 * @Author : Rutul Darji
 * @Description : Implement K stack in Array
 * */

public class KStack {

    int arr[];
    int top[];
    int next[];

    int n,k;
    int free;

    KStack(int n1, int k1) {
        n = n1;
        k = k1;

        next = new int[n];
        arr = new int[n];
        top = new int[k];

        for (int i=0;i<k;i++) {
            top[i] = -1;
        }

        for (int i = 0; i < n-1; i++) {
            next[i] = i+1;
        }
        next[n-1]=-1;
        free=0;
    }

    boolean isFull() {
        return free == -1;
    }


    void push(int data,int sn) {

        if (isFull()) {
            throw new RuntimeException("Overflow!!");
        }

        int i =free;
        free = next[i];
        next[i] = top[sn];
        top[sn] = i;

        arr[i] = data;
    }

    int pop(int sn) {
        if (isEmpty(sn)) {
            throw new RuntimeException("Underflow!!");
        }

        int i = top[sn];
        top[sn] = next[i];
        next[i] = free;
        free = i;

        return arr[i];
    }

    boolean isEmpty(int sn) {
        return top[sn] == -1;
    }



    public static void main(String[] args) {
        int k = 3, n = 10;
        KStack ks = new KStack(n, 3);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
