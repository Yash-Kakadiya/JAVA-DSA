
public class BST {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(25);
        bt.insert(75);
        bt.insert(85);
        bt.insert(35);
        bt.preOrder(bt.root);
        // bt.inOrder(bt.root);
        // bt.postOrder(bt.root);
    }
}