package dailyByte;

/*Given a linked list and a value, remove all nodes containing the provided value,
and return the resulting list.
Ex: Given the following linked lists and values...
1->2->3->null, value = 3, return 1->2->null
8->1->1->4->12->null, value = 1, return 8->4->12->null
7->12->2->9->null, value = 7, return 12->2->9->null
*/

public class removeValue {
    public static void main(String[] args) {
        ListNode l8 = new ListNode(1,null);
        ListNode l7 = new ListNode(1,l8);
        ListNode l6 = new ListNode(5,l7);
        ListNode l5 = new ListNode(4,l6);
        ListNode l4 = new ListNode(3,l5);
        ListNode l3 = new ListNode(6,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        int n = 1;
        ListNode res = checkValue(l7, n);
        ListNode temp = res;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    private static ListNode checkValue(ListNode head, int val) {
        while(head!=null && head.val==val)
            head = head.next;

        ListNode temp = head;
        while(temp!=null && temp.next!=null) {
            if (temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*Note - In case of Linked List and remove node problems, its better to take a dummy node.
* becaue we might need to remove the 1st node.*/