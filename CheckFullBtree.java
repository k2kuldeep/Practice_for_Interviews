/*A full binary tree is defined as a binary tree in which all nodes have either zero or two child nodes. 
 Conversely, there is no node in a full binary tree, which has one child node
*/
public class CheckFullBtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Node root = new Node(10); 
	        root.left = new Node(20); 
	        root.right = new Node(30); 
	        root.left.right = new Node(40); 
	        root.left.left = new Node(50); 
	        root.right.left = new Node(60); 
	        root.left.left.left = new Node(80); 
	        root.right.right = new Node(70); 
	        root.left.left.right = new Node(90); 
	        root.left.right.left = new Node(80); 
	        root.left.right.right = new Node(90); 
	        root.right.left.left = new Node(80); 
	        root.right.left.right = new Node(90); 
	        root.right.right.left = new Node(80); 
	        root.right.right.right = new Node(90);
		
		if(isFullTree(root) == true)
			System.out.println("Full BT");
		else
			System.out.println("NOT Full BT");

	}
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	
	static boolean isFullTree(Node root){
		
		if(root == null)
			return true;
		
		if(root.left != null && root.right == null)
			return false;
		
		if(root.left == null && root.right != null)
			return false;
		
		return isFullTree(root.left)&&isFullTree(root.right);
	}

}
