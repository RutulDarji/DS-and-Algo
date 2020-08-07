package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : Count subtrees with Sum equal to target in binary tree,Time Complexity : 0(N)
 *
 * */
public class FindInorderSuccessor {

    Node root;

    FindInorderSuccessor() {
        root = null;
    }

    int findInorderSuccessor(Node node,int target) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int left = findInorderSuccessor(node.left,target);
        int right = findInorderSuccessor(node.right,target);
        int finalAns = Integer.MAX_VALUE;

        if (node.data > target && node.data < finalAns) {
            finalAns = node.data;
        }

        if (left > target && left < finalAns) {
            finalAns = left;
        }

        if (right > target && right < finalAns) {
            finalAns = right;
        }

        return finalAns;
    }

    public static void main(String[] args) {
        FindInorderSuccessor tree = new FindInorderSuccessor();

        tree.root = new Node(6);
        tree.root.left = new Node(4);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(12);
        tree.root.right.left = new Node(8);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(9);


        System.out.println(tree.findInorderSuccessor(tree.root,6));
    }
}
