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
        demoNode1 root = new demoNode1(5);
        root.left = new demoNode1(2);
        root.right = new demoNode1(9);
        root.left.left = new demoNode1(1);
        root.left.right = new demoNode1(3);

        demoNode1 res = bstTolinklist(root);

        while(res!=null) {
            System.out.print(res.val + " ");
            res = res.right;
        }

    }

    private static demoNode1 bstTolinklist(demoNode1 root) {
        if (root==null)
            return null;

        while(root.left!=null){
            demoNode1 rightmost = rightmostOfLeftSubtree(root.left);
            demoNode1 newroot = root.left;
            root.left = null;
            rightmost.right = root;

            root = newroot;
        }
        return root;
    }

    private static demoNode1 rightmostOfLeftSubtree(demoNode1 root) {
        while(root.right!=null)
            root = root.right;

        return root;
    }


}
class demoNode1{
    int val;
    demoNode1 left, right;
    demoNode1(int v){
        val=v;
        left=right=null;
    }
}

/*Note - Inorder traversal will get the tree elements in sorted order.
*/