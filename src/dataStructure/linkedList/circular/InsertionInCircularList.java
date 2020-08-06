package dataStructure.linkedList.circular;

/**
 *
 * @Author : Rutul Darji
 * @Description : Insertion in Sorted manner in Circular LinkedList
 *
 * */


public class InsertionInCircularList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    InsertionInCircularList() {
        head = null;
    }

    void insert(Node node) {
        Node curr = head;

        if (curr == null) {
            node.next = node;
            head = node;
        } else if (curr.data >= node.data) { // insert at first

            while (curr.next!=head) {
                curr = curr.next;
            }

            curr.next = node;
            node.next = head;
            head = node;
        } else {

            while (curr.next!=head && curr.next.data < node.data) {
                curr = curr.next;
            }
            node.next =  curr.next;
            curr.next = node;
        }

    }


    void printList() {
        if (head!=null) {
            System.out.println("List data is::");
            Node curr = head;
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr!=head);
            return;
        }
        System.out.println("List is Empty!!");
    }




    public static void main(String[] args) {
        InsertionInCircularList list = new InsertionInCircularList();
        int arr[] = new int[] {12, 56, 2, 11, 1, 90};

        Node temp;
        list.printList();

//      Created linked list will be 1->2->11->12->56->90
        for (int i = 0; i < 6; i++)
        {
            temp = new Node(arr[i]);
            list.insert(temp);
        }

        list.printList();
    }
}
