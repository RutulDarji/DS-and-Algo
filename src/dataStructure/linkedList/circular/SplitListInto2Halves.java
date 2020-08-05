package dataStructure.linkedList.circular;

/**
 *
 * @Author : Rutul Darji
 * @Description : Using same logic as fast and slow pointer
 *
 * */
public class SplitListInto2Halves {

    static BasicInsertion.Node head,head1,head2;

    void splitList() {
        BasicInsertion.Node fast = head;
        BasicInsertion.Node slow = head;

        while (fast.next!=head && fast.next.next!=head) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // incase-of even nodes
        if (fast.next.next == head) {
            fast = fast.next;
        }

        head1 = head;

        if (head.next!=head) {
            head2 = slow.next;
        }

        fast.next = slow.next;
        slow.next = head;
    }

    void printList(BasicInsertion.Node node) {
        BasicInsertion.Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    public static void main(String[] args) {
        SplitListInto2Halves list = new SplitListInto2Halves();
        list.head = new BasicInsertion.Node(12);
        list.head.next = new BasicInsertion.Node(56);
        list.head.next.next = new BasicInsertion.Node(2);
        list.head.next.next.next = new BasicInsertion.Node(11);
        list.head.next.next.next.next = list.head;

        System.out.println("Original Circular Linked list ");
        list.printList(head);

        // Split the list
        list.splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        list.printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        list.printList(head2);
    }

}
