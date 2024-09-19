/*
 * 82. Write a program to construct a binary tree from given postorder and preorder traversal sequence
 */

public class ConstructBTree {

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

	void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.info + " ");
		inOrder(node.right);
	}

	static int preIdx = 0;
	static int postIdx = 0;

	Node constructTree(int[] pre, int[] post) {
		// Create a new node with the current value in preorder traversal
		Node root = new Node(pre[preIdx++]);

		// If the root's info does not match the current postorder value, construct the
		// left subtree
		if (root.info != post[postIdx])
			root.left = constructTree(pre, post);

		// If the root's info does not match the current postorder value, construct the
		// right subtree
		if (root.info != post[postIdx])
			root.right = constructTree(pre, post);

		// Increment the postorder index
		postIdx++;

		// Return the constructed tree node
		return root;
	}

	public static void main(String[] args) {

		ConstructBTree bt = new ConstructBTree();

		int pre[] = { 1, 2, 3, 4, 5, 6 };
		int post[] = { 3, 4, 2, 6, 5, 1 };

		bt.root = bt.constructTree(pre, post);

		System.out.println("Inorder traversal of the constructed tree:");
		bt.inOrder(bt.root);
	}
}
