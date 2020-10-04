
public class minDepthOfBinaryTree {
    public static void main(String[] args) {

        demoNode root = new demoNode(3);
        root.left = new demoNode(9);
        //root.right = new demoNode(20);
        //root.right.left = new demoNode(15);
        //root.right.right = new demoNode(7);

        int res = minDepth(root);
        System.out.println(res);

    }

    private static int minDepth(demoNode root) {
        if (root==null)
            return 0;

        int ldepth = minDepth(root.left);
        int rdepth = minDepth(root.right);

        if (ldepth==0||rdepth==0)
            return 1+ldepth+rdepth;
        else
            return 1+Math.min(ldepth,rdepth);

    }

}
class demoNode {
    int val;
    demoNode left, right;
    demoNode(int v)
    {
        val = v;
        left = right = null;
    }
}

