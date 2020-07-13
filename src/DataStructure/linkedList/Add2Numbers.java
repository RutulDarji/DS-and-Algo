package DataStructure.linkedList;

/**
 *
 * @Author : Rutul Darji
 * @Description : add 2 numbers through linkedList
 *
 * Input:
 *      List1: 5->6->3 // represents number 365
 *      List2: 8->4->2 // represents number 248
 *
 * Output:
 *      Resultant list: 3->1->6 // represents number 613
 *
 * Explanation: 365 + 248 = 613
 * */
public class Add2Numbers {

    static Node head1,head2;

    static class Node  {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node addTwoLinkedList(Node first, Node second) {

        Node result = null;
        Node prev = null;
        Node temp = null;
        int sum = 0;
        int carry = 0;

        while (first!=null || second!=null) {

            sum = carry + (first!=null ? first.data : 0) + (second!=null ? second.data : 0);

            carry = (sum>=10) ? 1 : 0;
            sum = sum % 10;

            temp = new Node(sum);

            if (result==null) {
                result = temp;
            } else {
                prev.next = temp;
            }

            prev = temp;

            if (first!=null) {
                first = first.next;
            }

            if (second!=null) {
                second = second.next;
            }
        }

        if (carry>0) {
            temp.next = new Node(carry);
        }

        return result;
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
        Add2Numbers list = new Add2Numbers();

        // creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.printLinkedList(head1);

        // creating seconnd list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printLinkedList(head2);

        // add the two lists and see the result
        Node rs = list.addTwoLinkedList(head1, head2);
        System.out.print("Resultant List is ");
        list.printLinkedList(rs);
    }

}
