package dataStructure.binarySearchTree;

import java.util.Stack;

public class SpiralLevelOrderTraversal {

    Node root;

    SpiralLevelOrderTraversal() {
        root = null;
    }

    void spiralLevelOrderTraversal(Node node) {
        if (node==null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        boolean directionFlag = false;
        Stack<Node> tempStack;
        stack.push(node);

        while (!stack.isEmpty()) {
            tempStack = new Stack<>();

            while (!stack.isEmpty()) {
                Node curNode = stack.pop();
                System.out.print(curNode.data + " ");
                if (!directionFlag) {
                    if (curNode.left!=null) {
                        tempStack.push(curNode.left);
                    }
                    if (curNode.right!=null) {
                        tempStack.push(curNode.right);
                    }
                } else {
                    if (curNode.right!=null) {
                        tempStack.push(curNode.right);
                    }
                    if (curNode.left!=null) {
                        tempStack.push(curNode.left);
                    }
                }
            }

            stack = tempStack;
            directionFlag = !directionFlag;
        }

    }

    public static void main(String[] args) {
        SpiralLevelOrderTraversal tree = new SpiralLevelOrderTraversal();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.spiralLevelOrderTraversal(tree.root);
    }

}
