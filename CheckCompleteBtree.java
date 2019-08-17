import java.util.LinkedList;
import java.util.Queue;
/*Given a Binary Tree, write a function to check whether the given Binary Tree is Complete Binary Tree or not.
 A complete binary tree is a binary tree in which every level, except possibly the last, 
 is completely filled, and all nodes are as far left as possible.
 */
public class CheckCompleteBtree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		//root.right.left = new Node(12);
		root.right.right = new Node(16);
		
		if(isCompleteBT(root) == true)
			System.out.println("COMPLETE BT");
		else
			System.out.println("NOT COMPLETE BT");
	}
	
	static class Node{
		
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	static boolean isCompleteBT(Node root){
		
		if(root == null)
			return true;
		
		Queue<Node> queue = new LinkedList<>();
		Boolean flag = false;
		
		queue.add(root);		
		/*queue.offer(root);
		Inserts the specified element into this queue if it is possible to do so immediately without 
		violating capacity restrictions.When using a capacity-restricted queue, this method is generally 
		preferable to add(E), which can fail to insert an element only by throwing an exception.*/
		
		while(!queue.isEmpty()){
			
			Node tempnode = queue.remove();
			
			if(tempnode.left != null){
				if(flag == true)
					return false;
				
				queue.add(tempnode.left);
				
			}
			else
				flag = true;
			
			if(tempnode.right != null){
				if(flag == true)
					return false;
				
				queue.add(tempnode.right);
			}
			else
				flag = true;
			
		}
		
		return true;
	}
}