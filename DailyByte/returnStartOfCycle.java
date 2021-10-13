package dailyByte;

/*Given a potentially cyclical linked list where each value is unique, return the node at
which the cycle starts. If the list does not contain a cycle, return null.
Ex: Given the following linked lists...
1->2->3, return null
1->2->3->4->5->2 (5 points back to 2), return a reference to the node containing 2
1->9->3->7->7 (7 points to itself), return a reference to the node containing 7
*/
public class returnStartOfCycle {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5,null);
        ListNode l4 = new ListNode(-4,l5);
        ListNode l3 = new ListNode(0,l4);
        ListNode l2 = new ListNode(8,l3);
        ListNode l1 = new ListNode(3,l2);
        l5.next = l2;

        ListNode res = checkCyclePos(l1);
        System.out.println(res.val);
    }

    private static ListNode checkCyclePos(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int flag =0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast){
                flag =1;
                break;
            }
        }

        if (flag==0)
            return null;

        slow = head;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*Note - The slow and fast pointers will first meet on the node which makes the loop.
* Eg : 3 -> 8 -> 0 -> -4
*           |__________|
* first time slow and fast pointer will met at node (-4).
* after that increasing them one by one will meet at node(8).*/