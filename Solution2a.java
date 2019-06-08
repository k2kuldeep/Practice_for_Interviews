/*Problem Statement : A linked list : 1->2->3->4->5->6 is given. Print in order
 	1 6
 	2 5
 	3 4
 */

public class Solution2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList1 list = new LinkedList1();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(70);
		
		list.print();
		list.rearrange();

	}

}
class LinkedList1{
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	//insert elements to list
	public void insert(int d){
		Node node = new Node(d);
		if(head == null)
			head = node;
		else{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = node;
			//System.out.println("node created = "+d);
		}
	}
	
	//print the list
	public void print() {
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//rearrange the list
	public void rearrange(){
		//finding the middle element
		Node slow = head;
		Node fast = slow.next;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//System.out.println(slow.data);
		
		//break into two list
		Node node1 = head;
		Node node2 = slow.next;
		slow.next = null;
		
		//reverse the second list
		node2 = reverserec(node2);
		
		//merging alternate nodes
		
		
		
	}

	// iterative reverse of linked list
	private Node reverseiter(Node node2) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node next = null;
		Node curr = node2;
		
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node2 = prev;
		
		return node2;
	}
	
	//recursive reverse of linked list
	static Node newhead;;
	private Node reverserec(Node node2){
		if(node2.next == null)
		{
			newhead = node2;
			return node2;
		}
		reverserec(node2.next);
		Node q = node2.next;		//the next node of node2 is q
		q.next = node2;
		node2.next = null;
		
		return newhead;
	}
	
	
}
