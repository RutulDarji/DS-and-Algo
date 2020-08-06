package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : print all paths from root to leaf in a binary tree in java
 *
 * */
public class PathFromRootToLeaf {

    Node root;
    PathFromRootToLeaf() {
        root = null;
    }

    void printPathFromRootToLeaf(Node node,int array[], int len) {
        if (node == null) {
            return;
        }

        array[len] = node.data;
        len++;

        if (node.left==null && node.right ==null) {
            printArray(array,len);
            return;
        }

        printPathFromRootToLeaf(node.left,array,len);
        printPathFromRootToLeaf(node.right,array,len);
    }

    void printArray(int array[],int len) {
        for (int i=0;i<len;i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        PathFromRootToLeaf tree = new PathFromRootToLeaf();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.printPathFromRootToLeaf(tree.root,new int[1000],0);
    }

}
