package dailyByte;

/*Given two sorted linked lists, merge them together in ascending order and return a
reference to the merged list
Ex: Given the following lists...
list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null
*/


public class mergeLinkedList {
    public static void main(String[] args) {
        ListNode l4 = new ListNode(4,null);
        ListNode l2 = new ListNode(2,l4);
        ListNode l1 = new ListNode(1,l2);

        ListNode l44 = new ListNode(4, null);
        ListNode l3 = new ListNode(3,l44);
        ListNode l11 = new ListNode(1,l3);
        
        ListNode sum = mergeListNode(l1, l11);
        ListNode result = sum;
        while (result != null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }

    private static ListNode mergeListNode(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode head = first;

        while(l1!=null && l2!=null){
            first.next = (l1.val < l2.val)? l1:l2;
            if (l1.val < l2.val)
                l1 = l1.next;
            else
                l2 = l2.next;

            first = first.next;
        }

        // the above loop will end only when one of the link list is null or both are null.
        first.next = (l1!=null)? l1 : (l2!=null)?l2:null;

        return head.next;
    }
}

class ListNode{
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}