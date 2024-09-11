
import java.util.Scanner;

class BinaryTree {

    class Node {
        int info;
        Node left;
        Node right;

        public Node(int info) {
            this.info = info;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.info + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.info + " ");
        inOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.info + " ");
    }

    void insertNodeItr(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node temp = root;
        while (true) {
            if (key < temp.info) {
                if (temp.left == null) {
                    temp.left = new Node(key);
                    return;
                }
                temp = temp.left;
            } else if (key > temp.info) {
                if (temp.right == null) {
                    temp.right = new Node(key);
                    return;
                }
                temp = temp.right;
            } else {
                return;
            }
        }
    }

    void insertNodeRec(int key) {
        root = insertRecord(root, key);
    }

    public Node insertRecord(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.info) {
            root.left = insertRecord(root.left, key);
        }
        if (key > root.info) {
            root.right = insertRecord(root.right, key);
        }
        return root;

    }

    boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (key == root.info) {
            return true;
        }
        if (key < root.info) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    void deleteNode(int key){
        Node add=searchParent(root,key);
    }
    Node searchParent(Node root,int key){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();

        while (true) {
            System.out.println("A menu driven program to implement Binary Search Tree (BST)");
            System.out.println("1.Insert Node,");
            System.out.println("2.Delete Node,");
            System.out.println("3.Search Node,");
            System.out.println("4.Preorder traversal.");
            System.out.println("5.Inorder traversal.");
            System.out.println("6.Postorder traversal.");
            System.out.println("Enter anything else to exit!");
            System.out.println("-------------------------------------");
            System.out.println("Enter option: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter value to be inserted : ");
                    bt.insertNodeItr(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value to be delete : ");
                    bt.deleteNode(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter value to be search : ");
                    bt.search(bt.root, sc.nextInt());
                    break;
                case 4:
                    System.out.println("Preorder traversal:");
                    bt.preOrder(bt.root);
                    ;
                    break;
                case 5:
                    System.out.println("Inorder traversal:");
                    bt.inOrder(bt.root);
                    ;
                    break;
                case 6:
                    System.out.println("Postorder traversal:");
                    bt.postOrder(bt.root);
                    break;
                default:
                    System.out.println("Exiting ...");
                    return;
            }
        }
    }
}
