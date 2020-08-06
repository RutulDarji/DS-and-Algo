package dataStructure.binarySearchTree;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @Author : Rutul Darji
 * @Description : print vertical sum of tree
 * approach: using inorder
 * */
public class PrintVerticalSumOfTree {

    Node root;
    PrintVerticalSumOfTree() {
        root = null;
    }

    void printVerticalSum(Node node, TreeMap<Integer,Integer> map,int level) {
        if (node==null) {
            return;
        }
        printVerticalSum(node.left,map,level-1);

        if (map.containsKey(level)) {
            Integer sum = map.get(level)+node.data;
            map.put(level,sum);
        } else {
            map.put(level,node.data);
        }
        printVerticalSum(node.right,map,level+1);
    }

    void printVerticalSumOfTree(Node node) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        printVerticalSum(node,map,0);

        for (Integer currentSum:map.values()) {
            System.out.println(currentSum + " ");
        }
    }

    public static void main(String[] args) {
        PrintVerticalSumOfTree tree = new PrintVerticalSumOfTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.printVerticalSumOfTree(tree.root);
    }
}
