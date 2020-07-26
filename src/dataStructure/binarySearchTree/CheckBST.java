package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : Check Given Tree is valid BST or not;
 *
 * */
public class CheckBST {

    Node root;

    boolean isValidBST(Node node,int min,int max) {

        if (node == null) {
            return true;
        }

        if (node.data<min || node.data>max) {
            return false;
        }

        return isValidBST(node.left,min,node.data - 1) &&
                isValidBST(node.right,node.data + 1,max);

    }

    public boolean isBst(Node root, Node l, Node r)
    {
        // Base condition
        if (root == null)
            return true;

        if (l != null && root.data <= l.data)
            return false;

        if (r != null && root.data >= r.data)
            return false;

        return isBst(root.left, l, root) &&
                isBst(root.right, root, r);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBst(tree.root,null,null))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

}
