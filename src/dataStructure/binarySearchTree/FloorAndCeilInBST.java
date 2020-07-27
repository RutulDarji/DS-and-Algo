package dataStructure.binarySearchTree;


/**
 *
 * @Author : Rutul Darji
 * @Description : Find The Floor and Ceil Value of given key
 *
 * */
public class FloorAndCeilInBST {

    Node root;

    FloorAndCeilInBST() {
        root = null;
    }

    int findCeil(Node node, int input)
    {
        if (node == null) {
            return -1;
        }

        if (node.data == input) {
            return node.data;
        }

        if (node.data < input) {
            return findCeil(node.right, input);
        }

        int ceil = findCeil(node.left, input);

        return (ceil >= input) ? ceil : node.data;
    }

    int findFloor(Node root, int key)
    {
        if (root == null)
            return Integer.MAX_VALUE;

        if (root.data == key)
            return root.data;

        if (root.data > key)
            return findFloor(root.left, key);

        int floorValue = findFloor(root.right, key);
        return (floorValue <= key) ? floorValue : root.data;
    }

    public static void main(String[] args) {
        FloorAndCeilInBST bst = new FloorAndCeilInBST();
        bst.root = new Node(8);
        bst.root.left = new Node(4);
        bst.root.right = new Node(12);
        bst.root.left.left = new Node(2);
        bst.root.left.right = new Node(6);
        bst.root.right.left = new Node(10);
        bst.root.right.right = new Node(14);
        for (int i = 0; i < 16; i++) {

            System.out.println(i + " ceil : " + bst.findCeil(bst.root, i) + " <-|-> Floor : " + bst.findFloor(bst.root,i));

        }

    }
}
