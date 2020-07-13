package DataStructure.linkedList;

/**
 *
 * @Author : Rutul Darji
 * @Description : Given a singly linked list, rotate the linked list counter-clockwise by k nodes.
 * Where k is a given positive integer. For example, if the given linked list is 10->20->30->40->50->60
 * and k is 4, the list should be modified to 50->60->10->20->30->40.
 * Assume that k is smaller than the count of nodes in linked list.
 *
 * */
public class RotateLinkedList {

    static Node head;

    static class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    void rotateLinkedList(int k) {
        if (k == 0) {
            return;
        }

        int count = 0;
        Node prev = null;
        Node curr = head;

        while (curr!=null && count<k) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            return;
        }

        Node temp = curr;

        while (temp.next!=null) {
            temp = temp.next;
        }

        prev.next = null;
        temp.next = head;
        head = curr;
    }

    void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    void printLinkedList(Node node) {
        if (node!=null) {
            Node current = node;
            while (current!=null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        System.out.println("");
    }


    public static void main(String[] args) {
        RotateLinkedList rotateLinkedList = new RotateLinkedList();

        for (int i = 60; i >= 10; i -= 10)
            rotateLinkedList.push(i);

        System.out.println("Given list");
        rotateLinkedList.printLinkedList(head);

        rotateLinkedList.rotateLinkedList(6);

        System.out.println("Rotated Linked List");
        rotateLinkedList.printLinkedList(head);
    }

}
