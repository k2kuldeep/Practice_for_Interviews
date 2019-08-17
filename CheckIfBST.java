/*A binary search tree (BST) is a node based binary tree data structure which has the following properties.
• The left subtree of a node contains only nodes with keys less than the node’s key.
• The right subtree of a node contains only nodes with keys greater than the node’s key.
• Both the left and right subtrees must also be binary search trees.
Time Complexity = O(n)
*/
class CheckIfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(3);  
	    root.left = new Node(2);  
	    root.right = new Node(5);  
	    root.left.left = new Node(1);  
	    root.left.right = new Node(4); 
		
	    if (isBST(root,null,null))  
	        System.out.print("Is BST");  
	    else
	        System.out.print("Not a BST");
	    

	}
	
	static class Node  
	{
	    int data;  
	    Node left;
	    Node right;
	    
	    //Constructor
	    Node (int data){
	    	this.data = data;
	    	left = null;
	    	right = null;
	    }
	}
	
	static boolean isBST(Node root, Node l, Node r)  
	{  
	    // Base condition  
	    if (root == null)  
	        return true;  
	   
	    if (l != null && root.data <= l.data)  
	        return false;  
	  
	    
	    if (r != null && root.data >= r.data)  
	        return false;  
	  
	    // check recursively for every node.  
	    return isBST(root.left, l, root) &&  
	        isBST(root.right, root, r);  
	}
}	