package dailyByte;
/*Given a non-empty linked list, return the middle node of the list. If the linked list contains
an even number of elements, return the node closer to the end.
1->2->3->null, return 2
1->2->3->4->null, return 3
1->null, return 1
*/
public class middleElement {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5,null);
        ListNode l4 = new ListNode(4,l5);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);

        ListNode x = findMiddle(l1);
        System.out.println(x.val);

    }
    private static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
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