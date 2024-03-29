/*Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
Example 1:
Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:
Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL
Note:
The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...*/

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(8,l1);
        ListNode l3 = new ListNode(7,l2);
        ListNode l4 = new ListNode(6,l3);
        ListNode l5 = new ListNode(5,l4);
        ListNode l6 = new ListNode(4,l5);
        ListNode l7 = new ListNode(3,l6);
        ListNode l8 = new ListNode(2,l7);
        ListNode l9 = new ListNode(1,l8);

        ListNode  l01 = oddEvenList(l9);
        printlist(l01);

    }

    private static void printlist(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }

    private static ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

       ListNode odd = head;
       ListNode even = head.next;
       ListNode evenhead = even;

       while(even!=null && even.next!=null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }

       odd.next = evenhead;

       return head;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

/*Note : two pointer method used.
while checking the end of loop, keep check on the pointer which will reach the end first.*/
