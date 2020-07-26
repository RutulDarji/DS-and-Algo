package dataStructure.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Author : Rutul Darji
 * @Description : Find Kth Smallest Element in BST
 * @Approach : 2 Approaches used :
 *             1) With Extra space : while traversing using inorder and store Data
 *             2) Without Extra space : while traversing using we keep count of K th Element and check
 * */
public class FindKthSmallestElement {

    Node root;
    List<Node> nodeList;
    int count;

    FindKthSmallestElement() {
        root = null;
        nodeList = new ArrayList<>();
        count = 0;
    }

    void findKthSmallestElementWithExtraSpace(Node node) {
        if (node!=null) {
            findKthSmallestElementWithExtraSpace(node.left);
            nodeList.add(node);
            findKthSmallestElementWithExtraSpace(node.right);
        }
    }


     Node findKthSmallestElement(Node node,int k) {

        if (node == null) {
            return null;
        }

        Node left = findKthSmallestElement(node.left,k);

        if (left!=null) {
            return left;
        }
        count++;
        if (count == k) {
            return node;
        }
        return findKthSmallestElement(node.right,k);
    }

    public static void main(String[] args) {
        FindKthSmallestElement tree = new FindKthSmallestElement();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        int k = 6;

        tree.findKthSmallestElementWithExtraSpace(tree.root);
        if (k<=tree.nodeList.size()) {
            System.out.println("Kth Smallest Element: " + tree.nodeList.get(k-1).data);
        } else {
            System.out.println("No Such  Element!! ");
        }

        Node result = tree.findKthSmallestElement(tree.root,k);

        if (result!=null) {
            System.out.println("Kth Smallest Element: " + result.data);
        } else {
            System.out.println("No Such  Element!! ");
        }



    }
}
