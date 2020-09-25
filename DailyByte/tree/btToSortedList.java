package dailyByte;

/*
Given a binary tree, flatten it to a linked list in-place.
For example, given the following tree:
    1
   / \
  2   5
 / \   \
3   4   6
The flattened tree should look like:
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
*/

public class btToSortedList {
    public static void main(String[] args) {
        demoNode1 root = new demoNode1(1);
        root.left = new demoNode1(2);
        root.right = new demoNode1(5);
        root.left.left = new demoNode1(3);
        root.left.right = new demoNode1(4);
        root.right.left = new demoNode1(6);

        demoNode1 res = btTolinklist(root);

        while(res!=null) {
            System.out.print(res.val + " ");
            res = res.right;
        }

    }
    private static demoNode1 btTolinklist(demoNode1 root) {
        if(root==null)
            return null;
        demoNode1 head = root;

        while(root!=null){
            if (root.left!=null){
                if (root.right==null){
                    root.right = root.left;
                    root.left = null;
                }
                else{
                    demoNode1 rightmost = rightmostNodeOfLeftSubtree(root.left);
                    rightmost.right = root.right;
                    root.right = root.left;
                    root.left = null;
                }
            }
            root = root.right;
        }
        return head;
    }

    private static demoNode1 rightmostNodeOfLeftSubtree(demoNode1 root) {
        while(root.right!=null)
            root = root.right;

        return root;
    }

}
/*
In the above question, Four situations are possible at each level of node.
A particular node,
    1.Does not has a left child or right child, problem already solved. End loop.

    2.Does not has a left child but has a right child - work on this node not required, move to the next level.

    3.Has a left child, but does not has a right child
    -make the left child as the right child
    -delete the left child

    4.Has a left child, and has a right child
    -find the rightmost node of the left subtree (lets call this node "Rightmost" node)
    -make the right child of level node as the right child of "Rightmost" node.
    -Repeat all steps from 3(as right child copied the problem can be considered as case 3).
*/