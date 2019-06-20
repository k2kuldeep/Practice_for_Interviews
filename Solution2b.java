import java.util.HashSet;
/*Write a program that checks whether a given Linked List contains loop .
 Follow up :  if loop is present then removes the loop. 
 */
public class Solution2b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DemoLinkedList list = new DemoLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.display();
		//create loop
		list.head.next.next.next.next.next = list.head.next;
		
		//detect loop
		/*if(list.detect_loop_using_HashSet(list.head))
			System.out.println("loop present");
		else
			System.out.println("no loop present");*/
		
		if(list.detect_loop(list.head))
			System.out.println("loop present");
		else
			System.out.println("no sloop present");
	}

}
class DemoLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insert(int d){
		Node node = new Node(d);
		if(head== null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next !=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public boolean detect_loop(Node head2) {
		//tortoise and rabbit method
		Node slow=head2;
		Node fast = slow.next;
		
		while(fast!= null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		
		return false;
	}

	public boolean detect_loop_using_HashSet(Node node) {
		//HashMap is used for mapping of two things. HashSet is used for only one thing.
		HashSet<Node> hs = new HashSet<>();
		while(node != null){
			if(hs.contains(node))
				return true;
			
			hs.add(node);
			
			node = node.next;
		}
		return false;
	}

	public void display(){
		System.out.println("Current list");
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println();
	}
}