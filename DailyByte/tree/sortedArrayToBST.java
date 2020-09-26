package dailyByte;
/*Given an array of numbers sorted in ascending order, return a height balanced
binary search tree using every number from the array. Note: height balanced meaning
that the level of any node’s two subtrees should not differ by more than one.
Ex: nums = [1, 2, 3] return a reference to the following tree...
       2
      /  \
     1    3
Ex: nums = [1, 2, 3, 4, 5, 6] return a reference to the following tree...
        3
       / \
     2    5
    /   /  \
  1    4    6
*/
public class sortedArrayToBST {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        demoNode res = createBST(arr, 0, arr.length-1);

        preorder(res);

    }

    private static void preorder(demoNode root) {
        if (root == null)
            return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }

    private static demoNode createBST(int[] arr, int start, int end) {
        if (start>end)
            return null;

        int mid = (start+end)/2;
        demoNode root = new demoNode(arr[mid]);

        root.left = createBST(arr,start,mid-1);

        root.right = createBST(arr, mid+1,end);

        return root;
    }
}
/*Note - take the middle element of array and make root.
* repeat the same for left and right side of tree
* i.e. createBST(,start,mid-1) and createBST(,mid+1,end)
*/