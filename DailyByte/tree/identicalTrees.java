package dailyByte;
/*Given two binary trees, return whether or not the two trees are identical. Note: identical meaning
they exhibit the same structure and the same values at each node. Ex: Given the following trees...
        2
       / \
      1   3
    2
   / \
  1   3

return true.
Ex: Given the following trees...
        1
         \
          9
           \
           18
    1
   /
  9
   \
    18

return false.
Ex: Given the following trees...
        2
       / \
      3   1
    2
   / \
  1   3

return false.
*/
public class identicalTrees {
    public static void main(String[] args) {
        demoNode root = new demoNode(2);
        root.left = new demoNode(3);
        root.right = new demoNode(1);


        demoNode root1 = new demoNode(2);
        root1.left = new demoNode(3);
        root1.right = new demoNode(1);

        boolean res = checkIdentical(root,root1);
        System.out.println(res);
    }

    private static boolean checkIdentical(demoNode root, demoNode root1) {
        if (root==null && root1==null)
            return true;

        if (root!=null && root1!=null){
            return (root.val==root1.val
                    && checkIdentical(root.left,root1.left)
                    && checkIdentical(root.right,root1.right));
        }


        return false;
    }
}
/*instead of checking for same of tree check where it differs.
* equate values of both the trees while traversing.
* */