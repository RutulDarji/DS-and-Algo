package DataStructure.queue;

/**
 * @Author: Rutul Darji
 * @Description : all Operation O(N)
 * @Link : https://www.geeksforgeeks.org/implementation-deque-using-circular-array/
 * */

public class Deque {

    static int MAX = 100;
    int rear,front,size;
    int arr[];

    Deque(int size) {
        this.size = size;
        front=-1;
        rear=0;
        arr = new int[MAX];
    }

    boolean isFull() {
        return ((front ==0 && rear ==size-1) || (front==rear+1));
    }

    boolean isEmpty() {
        return front==-1;
    }

    void insertRear(int data) {
        if (isFull()) {
            System.out.println("OverFlow of Data");
        }
        if (front==-1) {
            front = rear = 0;
        } else if(rear == size-1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = data;
    }

    void insertFront(int data) {
        if (isFull()) {
            System.out.println("OverFlow of Data");
        }
        if (front==-1) {
            front = rear = 0;
        } else if(front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = data;
    }

    void removeRear() {
        if (isEmpty()) {
            System.out.println("UnderFlow of Data");
        }
        if (front == rear) {
            front = rear = -1;
            return;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear --;
        }
    }

    void removeFront() {
        if (isEmpty()) {
            System.out.println("UnderFlow of Data");
        }
        if (front == rear) {
            front = rear = -1;
            return;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front ++;
        }
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("UnderFlow of Data");
            return -1;
        }

        return arr[front];
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("UnderFlow of Data");
            return -1;
        }

        return arr[rear];
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);

        System.out.println("Insert element at rear end  : 5 ");
        dq.insertRear(5);

        System.out.println("insert element at rear end : 10 ");
        dq.insertRear(10);

        System.out.println("get rear element : "+ dq.getRear());

        dq.removeRear();
        System.out.println("After delete rear element new rear become : " +
                dq.getRear());

        System.out.println("inserting element at front end");
        dq.insertFront(15);

        System.out.println("get front element: " +dq.getFront());

        dq.removeFront();

        System.out.println("After delete front element new front become : " +
                +  dq.getFront());
    }
}
