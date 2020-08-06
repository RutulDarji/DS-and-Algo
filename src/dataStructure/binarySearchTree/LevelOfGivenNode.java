package dataStructure.binarySearchTree;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find the level of given node
 *
 * */
public class LevelOfGivenNode {

    Node root;

    LevelOfGivenNode() {
        root = null;
    }

    int getLevel(Node node,int key,int level) {
        if (node == null) {
            return 0;
        }

        if (node.data == key) {
            return level;
        }

        int result = getLevel(node.left,key,level+1);
        if (result!=0) {
            return result;
        }
        return getLevel(node.right,key,level+1);
    }

    public static void main(String[] args) {
        LevelOfGivenNode tree = new LevelOfGivenNode();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        System.out.println(tree.getLevel(tree.root,5,1));
        System.out.println(tree.getLevel(tree.root,2,1));
        System.out.println(tree.getLevel(tree.root,10,1));
        System.out.println(tree.getLevel(tree.root,3,1));

    }
}
