package leet_code;
/* Given a non-empty binary search tree and a target value, find the value in the BST that
is closest to the target.
Note:
    Given target value is a floating point.
    You are guaranteed to have only one unique value in the BST that is closest to the target.
*/
public class closestBinarySearchTreeValue {
    public static void main(String[] args) {
        demoNode root = new demoNode(4);
        root.left = new demoNode(2);
        root.right = new demoNode(7);
        root.left.left = new demoNode(1);
        root.left.right = new demoNode(3);

        int res = findclosest(root,8);
        System.out.println(res);
    }

    static int min_diff,min_diff_key;
    private static int findclosest(demoNode root, int i) {
        min_diff = Integer.MAX_VALUE;
        min_diff_key = -1;

        findmindiffkey(root,i);

        return min_diff_key;
    }

    private static void findmindiffkey(demoNode root, int k) {
        if (root==null)
            return;

        if (root.val == k){
            min_diff_key = root.val;
            return;
        }

        //here we check if we can get minimum difference less than current min_diff.
        //if we cannot find minimum key than this, return this.
        if (min_diff > Math.abs(root.val-k)){
            min_diff = Math.abs(root.val-k);
            min_diff_key = root.val;
        }

        if (k>root.val)
            findmindiffkey(root.right,k);
        else
            findmindiffkey(root.left,k);
    }

}
class demoNode{
    int val;
    demoNode left,right;
    demoNode(int val){
        this.val = val;
    }
}