package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : Swap 2 Nodes and correct BST
 * @Approach :  Inorder Traversal, 2 Things to be  considered
 *             1) 2 nodes are not adjacent
 *             2) 2 nodes are adjacent
 * */
public class SwapNodeAndCorrectBST {

    Node root;
    Node first,mid,last,prev;

    SwapNodeAndCorrectBST() {
        root = null;
    }

    void correctBSTUtil(Node node) {
        if (node!=null) {
            correctBSTUtil(node.left);
            if (prev!=null && node.data < prev.data) {
                if (first == null) {
                    first = prev;
                    mid = node;
                } else {
                    last = node;
                }
            }
            prev = node;
            correctBSTUtil(node.right);
        }
    }

    void correctBST(Node node) {

        first = mid = prev = last = null;
        if (node!=null) {
            correctBSTUtil(node);

            if (first!=null && last!=null) { // 2 nodes are not adjacent
                swap(first,last);
            } else if (first!=null && mid!=null){ //2 nodes are  adjacent
                swap(first,mid);
            }
        }
    }

    void swap(Node src,Node target) {
        int tmp = src.data;
        src.data = target.data;
        target.data = tmp;
    }

    void inorder(Node node) {
        if (node!=null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        SwapNodeAndCorrectBST bst = new SwapNodeAndCorrectBST();
        bst.root = new Node(6);
        bst.root.left = new Node(10);
        bst.root.right = new Node(2);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(3);
        bst.root.right.right = new Node(12);
        bst.root.right.left = new Node(7);

        System.out.println("Inorder Traversal"+
                " of the original tree");

        bst.inorder(bst.root);

        bst.correctBST(bst.root);

        System.out.println("\nInorder Traversal"+
                " of the fixed tree");
        bst.inorder(bst.root);
    }



}
