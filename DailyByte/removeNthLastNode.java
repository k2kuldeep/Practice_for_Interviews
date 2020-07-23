package dailyByte;

import java.util.List;

/*Given a linked list and a value n, remove the nth to last node and return the
resulting list.
Ex: Given the following linked lists...
1->2->3->null, n = 1, return 1->2->null
1->2->3->null, n = 2, return 1->3->null
1->2->3->null, n = 3, return 2->3->null
*/
public class removeNthLastNode {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5,null);
        ListNode l4 = new ListNode(4,l5);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        int n = 2;
        ListNode res = removeNthfromEnd(l1, n);
        while(res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }

    private static ListNode removeNthfromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode sec = dummy;

        for (int i=0;i<=n;i++){
            first = first.next;
        }

        while(first!=null){
            sec = sec.next;
            first = first.next;
        }

        sec.next = sec.next.next;

        return dummy.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*Note - why return dummy.next and not head.
* you have list (1,2) and you have given , 2 to remove.
* so u have to remove "1". so head will point at "1" but dummy.next will point 2.*/
