package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : print BoundaryTraversal of tree.
 * approach: 1)print left edges
 *           2)print leaf nodes
 *           3)print right edges
 * */
public class BoundaryTraversal {

    Node root;
    BoundaryTraversal() {
        root = null;
    }

    void printLeftEdges(Node node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            return;
        }

        System.out.print(node.data + " ");
        if (node.left!=null) {
            printLeftEdges(node.left);
        } else {
            printLeftEdges(node.right);
        }
    }

    void printRightEdges(Node node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            return;
        }
        if (node.right!=null) {
            printRightEdges(node.right);
        } else {
            printRightEdges(node.left);
        }
        System.out.print(node.data + " ");
    }

    void printLeafs(Node node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }
        printLeafs(node.left);
        printLeafs(node.right);
    }

    void printBoundaryTraversal(Node node){
        System.out.print(node.data + " ");
        printLeftEdges(node.left);
        printLeafs(node);
        printRightEdges(node.right);
    }

    public static void main(String[] args) {
        BoundaryTraversal tree = new BoundaryTraversal();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.printBoundaryTraversal(tree.root);
    }

}
