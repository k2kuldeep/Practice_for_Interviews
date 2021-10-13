package dailyByte;
/*Given a linked list, containing unique numbers, return whether or not it has a cycle.
Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)
Ex: Given the following linked lists...
1->2->3->1 -> true (3 points back to 1)
1->2->3 -> false
1->1 true (1 points to itself)
*/
public class containCycle {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5,null);
        ListNode l4 = new ListNode(-4,l5);
        ListNode l3 = new ListNode(0,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(3,l2);
        l5.next = l2;

        boolean res = checkCycle(l1);
        System.out.println(res);
    }

    private static boolean checkCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int found = 0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                found = 1;
                break;
            }
        }
        System.out.println(slow.val);
        return (found==1)? true : false;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}