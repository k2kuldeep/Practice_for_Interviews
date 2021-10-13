package dailyByte;
/*Given a linked list, containing unique values, reverse it, and return the result.
Ex: Given the following linked lists...
1->2->3->null, return a reference to the node that contains 3 which points to a list that
looks like the following: 3->2->1->null
7->15->9->2->null, return a reference to the node that contains 2 which points to a list that
looks like the following: 2->9->15->7->null
1->null, return a reference to the node that contains 1 which points to a list that
looks like the following: 1->null
*/
public class reverseList {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5,null);
        ListNode l4 = new ListNode(4,l5);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ListNode res = funcreverseList(l1);
        ListNode temp = res;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    private static ListNode funcreverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*Note - Linked list is reversed with 3 pointers- current, next and prev.
* current points to head. prev and next points to null.
1. First make next pointer current->next.
2. then reverse the next of current node.
3. then make current as prev and next as current */