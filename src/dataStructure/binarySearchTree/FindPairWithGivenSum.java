package dataStructure.binarySearchTree;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Pair With Given Sum in BST
 * */

public class FindPairWithGivenSum {

    Node root;


    FindPairWithGivenSum() {
        root = null ;
    }

    void inorder()
    {
        inorderUtil(this.root);
    }

    // Utility function for inorder traversal of the tree
    void inorderUtil(Node node)
    {
        if (node == null)
            return;

        inorderUtil(node.left);
        System.out.print(node.data + " ");
        inorderUtil(node.right);
    }

    void insert(int key)
    {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int data)
    {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(data);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    void convertBSTIntoList(Node node, List<Integer> list) {
        if (node!=null) {
            convertBSTIntoList(node.left,list);
            list.add(node.data);
            convertBSTIntoList(node.right,list);
        }
    }

    void convertBSTIntoMap(Node node, Map<Integer,Integer> map) {
        if (node!=null) {
            convertBSTIntoMap(node.left,map);
            map.put(node.data,1);
            convertBSTIntoMap(node.right,map);
        }
    }

    boolean findPairWithList(Node node, int target) {
        if (node!=null) {
            List<Integer> nodeList = new ArrayList<>();
            convertBSTIntoList(node,nodeList);

            int start = 0;
            int end = nodeList.size()-1;

            while (start<end) {
                if (nodeList.get(start) + nodeList.get(end) == target) {
                    System.out.println("Found Pair with Target: "
                            + target + " { " + nodeList.get(start) + " , " + nodeList.get(end) + " }");
                    return true;
                } else if (nodeList.get(start) + nodeList.get(end) < target) {
                    start++;
                } else if (nodeList.get(start) + nodeList.get(end) > target) {
                    end--;
                }
            }
        }
        System.out.println("No Pair Found With Target: "+ target);
        return false;
    }

    boolean findPairWithMap(Node node, int target) {
        if (node!=null) {
            Map<Integer,Integer> map = new HashMap<>();
            convertBSTIntoMap(node,map);

            for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
                int remaining = target - entry.getKey();
                if (map.containsKey(remaining)) {
                    System.out.println("Found Pair with Target: "
                            + target + " { " + entry.getKey() + " , " + remaining + " }");
                    return true;
                }
            }
        }
        System.out.println("No Pair Found With Target: "+ target);
        return false;
    }

    public static void main(String[] args) {
        FindPairWithGivenSum tree = new FindPairWithGivenSum();
        /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(12);
        tree.insert(16);
        tree.insert(25);

        tree.findPairWithList(tree.root, 33);
        tree.findPairWithMap(tree.root, 33);
    }

}
