package dataStructure.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : print Reverse Level order traversal of tree.
 * approach: using same process as level order and storing current into stack
 * */
public class ReverseLevelOrderTraversal {

    Node root;
    ReverseLevelOrderTraversal() {
        root = null;
    }

    void reverseLevelOrderTraversal(Node node) {
        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.right!=null) {
                queue.add(temp.right);
            }
            if (temp.left!=null) {
                queue.add(temp.left);
            }
            stack.push(temp);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.reverseLevelOrderTraversal(tree.root);
    }
}
