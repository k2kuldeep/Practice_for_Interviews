//WAP to delete a node in linkedlist without having the head pointer.
public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoLinkedList demo = new DemoLinkedList();
		demo.insert(5);
		demo.insert(10);
		demo.insert(25);
		demo.insert(15);
		demo.insert(50);
		demo.insert(30);
		demo.insert(2);
		
		demo.printList();
		
		System.out.println("node to delete = "+demo.head.next.next.next.data);
		demo.deleteNode(demo.head.next.next.next);
		
		demo.printList();

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
	
	void insert(int x){
		Node node = new Node(x);
		if(head == null)
			head = node;
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void deleteNode(Node node) {
		// TODO Auto-generated method stub
		Node temp = node.next;
		node.data = temp.data;
		
		node.next = temp.next;
		
	}

	void printList(){
		Node temp = head;
		while(temp.next != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
}