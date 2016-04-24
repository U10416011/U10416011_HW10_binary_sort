
public class TestBST {
	public static void main(String args[]) {
		  int[] a = { 2, 9, 4, 3, 4, 5, 9, 7, 8, 4, 6, 1 };
		  BST bst = new BST(new Integer(a[0]));
		  for (int i = 1; i < a.length; i++) {
		   bst.Insert(bst.root, new Integer(a[i]));
		  }
		  bst.inOrder(bst.root);
		 }
}
