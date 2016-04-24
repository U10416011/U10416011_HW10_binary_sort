//U10416011
public class BST {
	public TreeNode root;
	public BST(Object x) { //constructor
		root = new TreeNode(x);
	}
	public TreeNode Insert(TreeNode node, int x) {//insert the number in the tree
		if (node == null) {
			return node = new TreeNode(x);
		}
		if (x < (Integer) node.element) {
			node.left = Insert(node.left, x);
		} else {
			node.right = Insert(node.right, x);
		}
		return node;
	}
	public void inOrder(TreeNode node) {// Inorder traversal from the root
		if (node != null) {
			inOrder(node.left);
			System.out.print(((Integer) node.element).intValue() + " ");
			inOrder(node.right);
  		}
	}
}
