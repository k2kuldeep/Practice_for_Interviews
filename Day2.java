/*Problem Statement: Find Nth last element of a linked list. For  example, in list 1->2->5->4->null 3rd last element is 2

Follow-Up Question   : Do the same in a single iteration.
Follow-Up Question 2: Present Linked list as other data structures (stack, queue, tree, graph)
*/
import java.util.*;
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList list = new LinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(5);
		list.insertNode(4);
		list.insertNode(9);
		
		list.print(2);
	}
	
}
	class LinkedList
	{
		static int count = 0;		// for counting from last upto n(given)
		
		Node Head;
		
		class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				next = null;
			}
		}
		
		public void insertNode(int d){
			Node node = new Node(d);
			if(Head == null)
				Head = node;
			else{
				Node temp = Head;
				while(temp.next != null)
					temp = temp.next;
				
				temp.next = node;
			}
				
		}
		
		public void print(int k){
			NthLast(Head, k);
		}
		
		//resursion never felt soo very much in use.
		public void NthLast(Node head,int n){
			if(head == null)
				return ;
			else{
				NthLast(head.next,n);
				count++;
				if(count == n)
				{
					System.out.println(head.data);
				}
				
			}
		}
		
		
	}
