package dailyByte;
/*Given the reference to the root of a binary search tree and a search value, return the
reference to the node that contains the value if it exists and null otherwise.
Note: all values in the binary search tree will be unique.
Ex: Given the tree...
        3
       / \
      1   4
and the search value 1 return a reference to the node containing 1.
Ex: Given the tree
        7
       / \
      5   9
         / \
        8   10
and the search value 9 return a reference to the node containing 9.
Ex: Given the tree
        8
       / \
      6   9
and the search value 7 return null.
*/
public class findValue {
    public static void main(String[] args) {
        demoNode root = new demoNode(4);
        root.left = new demoNode(2);
        root.right = new demoNode(7);
        root.left.left = new demoNode(1);
        root.left.right = new demoNode(3);

        int search = 5;
        demoNode res = getNodeLink(root,search);
        if (res!=null)
            System.out.println(res.val);
        else
            System.out.println("null");
    }

    private static demoNode getNodeLink(demoNode root,int val) {
        if (root == null)
            return null;

        if (root.val==val)
            return root;
        else if (root.val < val)
            return getNodeLink(root.right,val);
        else if (root.val > val)
            return getNodeLink(root.left,val);
        return null;
    }
}
class demoNode{
    int val;
    demoNode left,right;
    demoNode(int val){
        this.val = val;
    }
}
/*Node - simple implementation of tree. */
