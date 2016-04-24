
public class TreeNode {//node for tree
	public Object element;
	public TreeNode left;
	public TreeNode right;
	//default constructor
	public TreeNode(){ 
	}
	// constructors
	public TreeNode(Object theElement) {
		this(theElement, null, null);
	}
	public TreeNode(Object theElement, TreeNode lLink, TreeNode rLink) {
		element = theElement;
		this.left = lLink;
		this.right = rLink;
	}
}
