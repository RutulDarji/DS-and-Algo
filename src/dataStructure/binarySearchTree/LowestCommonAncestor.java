package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Lowest Common Ancestor of Given 2 numbers n1,n2
 * @Approach: check curr node is greater than both numbers move to left side,
 * if curr node is less then both number than move to right side, or return curr node
 *  Time complexity 0(h)
 * */
public class LowestCommonAncestor {

    Node root;

    // recursive
    Node findLCAWithRecursive(Node node, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (node.data > n1 && node.data>n2) {
            return findLCAWithRecursive(node.left,n1,n2);
        }

        if (node.data < n1 && node.data < n2) {
            return findLCAWithRecursive(node.right,n1,n2);
        }

        return node;
    }

    // iterative

    Node findLCAWithIterative(Node node,int n1,int n2) {

        if (node==null) {
            return null;
        }

        while (node!=null) {
            if (node.data > n1 && node.data > n2) {
                node = node.left;
            } else if (node.data < n1 && node.data < n2) {
                node = node.right;
            } else {
                break;
            }
        }
        return node;
    }


    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
        Node t = tree.findLCAWithRecursive(tree.root, n1, n2);
        if (t!=null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
        } else {
            System.out.println("LCA of " + n1 + " and " + n2 + " is Not Found");
        }


        n1 = 14;
        n2 = 8;
        t = tree.findLCAWithRecursive(tree.root, n1, n2);
        if(t!=null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
        } else {
            System.out.println("LCA of " + n1 + " and " + n2 + " is Not Found");
        }

    }
}
