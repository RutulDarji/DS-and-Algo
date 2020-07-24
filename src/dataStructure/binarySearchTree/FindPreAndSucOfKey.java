package dataStructure.binarySearchTree;

public class FindPreAndSucOfKey {

    void findPreAndSuc(Node node,Node pre,Node suc,int key) {
        if (node==null) return;

        if (node.data == key) {
            if (node.left!=null) {
                Node temp = node.left;
                while (temp.right!=null) {
                    temp = temp.right;
                }
                pre = temp;
            }
            if (node.right!=null) {
                Node temp = node.right;
                while (temp.left!=null) {
                    temp = temp.left;
                }
                suc = temp;
            }
        }

        if (key < node.data) {
            suc = node;
            findPreAndSuc(node.left,pre,suc,key);
        } else {
            pre = node;
            findPreAndSuc(node.right,pre,suc,key);
        }
    }
}
