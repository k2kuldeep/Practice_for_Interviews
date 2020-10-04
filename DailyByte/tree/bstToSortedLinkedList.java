package dailyByte;

/*Given a binary search tree, rearrange the tree such that it forms a linked list where
all its values are in ascending order.
Ex: Given the following tree...
        5
       / \
      1   6
return...
1
 \
  5
   \
    6
Ex: Given the following tree...
       5
      / \
    2    9
   / \
  1   3
return...
1
 \
  2
   \
    3
     \
      5
       \
        9
Ex: Given the following tree...
5
 \
  6
return...
5
 \
  6
*/
public class bstToSortedLinkedList {
    public static void main(String[] args) {
        demoNode root = new demoNode(5);
        root.left = new demoNode(3);
        root.right = new demoNode(7);
        root.left.left = new demoNode(2);
        root.left.right = new demoNode(4);
        root.right.left = new demoNode(6);
        root.right.right = new demoNode(8);

        demoNode res = bstTolinklist(root);

        while(res!=null) {
            System.out.print(res.val + " ");
            res = res.right;
        }

    }

    static demoNode dummy = new demoNode(-1);
    static demoNode prev = dummy;
    private static demoNode bstTolinklist(demoNode root)
    {
        if (root == null)
            return null;

        inorder(root);
        prev.left = null;
        prev.right = null;

        return dummy.right;
    }

    private static void inorder(demoNode curr) {
        if (curr==null)
            return;

        inorder(curr.left);
        prev.left = null;
        prev.right = curr;

        prev = curr;
        inorder(curr.right);
    }
}

class demoNode{
    int val;
    demoNode left, right;
    demoNode(int v){
        val=v;
        left=right=null;
    }
}

/*Note - Inorder traversal will get the tree elements in sorted order.
        making dummy node static was only way. if it was in recursion, then dummy node returned to its 
        previous value of -1 when stack returned.
*/
