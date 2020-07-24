package dataStructure.binarySearchTree;

public class BasicOperationOnBST {

    Node root;

    BasicOperationOnBST() {
        root = null;
    }

    void insertKey(int key) {
        root =  insertNode(root,key);
    }

    private Node insertNode(Node node,int key) {

        if (node == null) {
            node = new Node(key);
            return node;
        }

        if (key<node.data) {
            node.left = insertNode(node.left,key);
        } else if (key>node.data){
            node.right = insertNode(node.right,key);
        }

        return node;
    }

    Node search(int key) {
        return search(root,key);
    }

    private Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key<root.data) {
            return search(root.left,key);
        }
        return search(root.right,key);
    }

    void deleteKey(int key) {
        root = deleteNode(root,key);
    }

    private Node deleteNode(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key< node.data) {
            node.left = deleteNode(node.left,key);
        } else if (key> node.data){
            node.right = deleteNode(node.right,key);
        } else {
            if (node.left == null) {
                return  node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = minValue(node.right);
            node.right = deleteNode(node.right, node.data);
        }

        return node;
    }

    private int minValue(Node node) {
        int min = node.data;
        while (node.left!=null) {
            node = node.left;
        }
        return min;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node node)
    {
        if (node != null)
        {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    public static void main(String[] args) {
        BasicOperationOnBST bst = new BasicOperationOnBST();
        bst.insertKey(50);
        bst.insertKey(30);
        bst.insertKey(20);
        bst.insertKey(40);
        bst.insertKey(70);
        bst.insertKey(60);
        bst.insertKey(80);

        System.out.println("Inorder traversal of the given tree");
        bst.inorder();

        Node result = bst.search(50);
        System.out.println("");
        if (result!=null) {
            System.out.println("Found 50");
        } else {
            System.out.println("Not Found 50");
        }

        result = bst.search(90);
        if (result!=null) {
            System.out.println("Found 90");
        } else {
            System.out.println("Not Found 90");
        }


        System.out.println("\nDelete 20");
        bst.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        bst.inorder();

        System.out.println("\nDelete 30");
        bst.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        bst.inorder();

        System.out.println("\nDelete 50");
        bst.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        bst.inorder();
    }


}
