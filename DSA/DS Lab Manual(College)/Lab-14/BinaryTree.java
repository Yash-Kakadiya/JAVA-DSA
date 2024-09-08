import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return (new Node(data));
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        } else {
        }
        return root;
    }

    void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        preOrder(node.left);
        System.out.println(node.data + " ");
        preOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null) {
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.data + " ");
    }
}
