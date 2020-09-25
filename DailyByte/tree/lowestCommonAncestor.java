package dailyByte;
/*Given a binary search tree that contains unique values and two nodes within the tree, a, and b,
return their lowest common ancestor. Note: the lowest common ancestor of two nodes is the deepest
node within the tree such that both nodes are descendants of it.
Ex: Given the following tree...
       7
      / \
    2    9
   / \
  1   5
and a = 1, b = 9, return a reference to the node containing 7.
Ex: Given the following tree...
        8
       / \
      3   9
     / \
    2   6
and a = 2, b = 6, return a reference to the node containing 3.
Ex: Given the following tree...
        8
       / \
      6   9
and a = 6, b = 8, return a reference to the node containing 8.
*/
public class lowestCommonAncestor {
    public static void main(String[] args) {
        demoNode root = new demoNode(20);
        root.left = new demoNode(8);
        root.right = new demoNode(22);
        root.left.left = new demoNode(4);
        root.left.right = new demoNode(12);
        root.right.left = new demoNode(10);
        root.right.right = new demoNode(14);
        int a = 8;
        int b =14;

        demoNode res = findAncestor(root,a,b);
        System.out.println(res.val);
    }

    private static demoNode findAncestor(demoNode root,int a, int b) {
        if (root==null)
            return null;

        while(root!=null){
            if (root.val>a && root.val>b)
                root = root.left;

            if (root.val<a && root.val<b)
                root = root.right;

            else
                break;

        }
        return root;
    }
}

/* if a and b are less than root value, then lca is in the left subtree.
* if a and b are greater than root value, then lca is in the right subtree.
* else if any other case, then that node is the lca.
*/