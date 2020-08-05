package dataStructure.linkedList.circular;

/**
 *
 * @Author : Rutul Darji
 * @Description : We keep track of last node so it make easier to add node at last and front..
 *
 * */
public class BasicInsertion {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtEmpty(Node last, int data) {
        if (last !=null) {
            return last;
        }

        Node temp = new Node(data);
        last = temp;
        last.next = last;
        return last;
    }

    static Node insertAddBeginning(Node last, int data) {
        if (last == null) {
            return insertAtEmpty(last, data);
        }

        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        return last;
    }

    static Node insertAtEnd(Node last,int data) {
        if (last == null) {
            return insertAtEmpty(last, data);
        }
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        last = temp;
        return last;
    }

    static Node insertAfter(Node last,int item ,int data) {
        if (last == null) {
            return null;
        }

        Node p = last.next;

        do {
            if (p.data == item) {
                Node temp = new Node(data);
                temp.next = p.next;
                p.next = temp;
                if (p == last) {
                    last = temp;
                }
                return last;
            }
            p = p.next;
        } while (p!=last.next);
        System.out.println("Not Present");
        return last;
    }

    static void traverse(Node last) {
        if (last == null) {
            System.out.print("List is empty!!");
            return;
        }

        Node p = last.next;


        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p!=last.next);

      }

    public static void main(String[] args) {
        Node last = null;
        last = insertAtEmpty(last, 6);
        last = insertAddBeginning(last, 4);
        last = insertAddBeginning(last, 2);
        last = insertAtEnd(last, 8);
        last = insertAtEnd(last, 12);
        last = insertAfter(last, 8, 10);

        traverse(last);
    }
}
