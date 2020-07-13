package DataStructure.linkedList;

import java.util.HashSet;

/**
 *
 * @Author : Rutul Darji
 * @Description : Delete and remove Loop from Linked List
 * @Link : https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 * */
public class DetectAndRemoveLoop {

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    void detectAndRemoveLoop(Node node) {

        if (node==null || node.next == null) {
            return;
        }

        Node fast = node;
        Node slow = node;

        slow = slow.next;
        fast = fast.next.next;

        while (fast!=null && fast.next!=null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == slow) {
            slow = node;

            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;
            }
            fast.next = null;
        }

    }

    boolean detectAndRemoveLoopWithHashing(Node node) {

        if (head==null || head.next== null) {
            return false;
        }

        HashSet<Node> nodes = new HashSet<>();
        Node prev = null;
        Node curr = node;

        while (curr!=null) {
            if (nodes.contains(curr)) {
                prev.next = null;
                return true;
            } else {
                nodes.add(curr);
                prev = curr;
                curr = curr.next;
            }
        }
        return false;
    }

    void printLinkedList(Node node) {
        if (node!=null) {
            Node current = node;
            while (current!=null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {

        DetectAndRemoveLoop removeLoop = new DetectAndRemoveLoop();

        head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        head.next.next.next.next.next = head.next.next;
//        removeLoop.detectAndRemoveLoop(head);
        boolean result = removeLoop.detectAndRemoveLoopWithHashing(head);

        if (result) {
            System.out.println("Loop is present");
        } else {
            System.out.println("No Loop present in LinkedList");
        }

        removeLoop.printLinkedList(head);
    }

}
