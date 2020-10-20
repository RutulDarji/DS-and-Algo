package CrackingCodingInterview.linkedlist;

import java.util.Stack;

public class PallindromeCheck {

    LinkedList head1 = null;
    LinkedList head2 = null;

    boolean isListPallindrome(LinkedList node) {

        LinkedList slow = node;
        LinkedList fast = node;

        Stack<Integer> stack = new Stack<>();

        while (fast!=null && fast.next!=null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // if list is odd then skip mid element

        if (fast!=null) {
            slow = slow.next;
        }


        while (slow!=null) {
            int top = stack.pop().intValue();

            if (top!= slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {

        PallindromeCheck list = new PallindromeCheck();

        list.head1 = new LinkedList(1);
        list.head1.next = new LinkedList(2);
        list.head1.next.next = new LinkedList(3);
        list.head1.next.next.next = new LinkedList(2);
        list.head1.next.next.next.next = new LinkedList(1);

        list.head2 = new LinkedList(1);
        list.head2.next = new LinkedList(2);
        list.head2.next.next = new LinkedList(3);
        list.head2.next.next.next = new LinkedList(3);
        list.head2.next.next.next.next = new LinkedList(2);
        list.head2.next.next.next.next.next = new LinkedList(1);

        System.out.println("isPallindrom: " + list.isListPallindrome(list.head1));
        System.out.println("isPallindrom: " + list.isListPallindrome(list.head2));

    }


}
