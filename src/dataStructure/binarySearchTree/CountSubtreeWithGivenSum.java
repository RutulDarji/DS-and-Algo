package dataStructure.binarySearchTree;
/**
 *
 * @Author : Rutul Darji
 * @Description : Count subtrees with Sum equal to target in binary tree
 *
 * */
public class CountSubtreeWithGivenSum {

    Node root;

    static class Pair {
        int sum;
        int count;

        public Pair(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    CountSubtreeWithGivenSum() {
        root = null;
    }

    Pair findCount(Node node,int target) {
        if (node == null) {
            return new Pair(0,0);
        }

        Pair left =findCount(node.left,target);
        Pair right =findCount(node.right,target);

        int sum = left.sum + right.sum + node.data;
        int count = left.count + right.count;

        if (sum == target) {
            count++;
        }
        return new Pair(sum,count);
    }


    public static void main(String[] args) {
        CountSubtreeWithGivenSum tree = new CountSubtreeWithGivenSum();
        tree.root =  new Node(4);
        tree.root. left = new Node(5);
        tree.root. right = new Node(-2);
        tree.root. left. left = new Node(-1);
        tree.root. left. right = new Node(2);
        tree.root. right. right = new Node(5);
        tree.root. right. left = new Node(8);
        tree.root. right. left. left = new Node(7);
        tree.root. right. left. right = new Node(-9);

        System.out.println(tree.findCount(tree.root,6).count);
    }
}
