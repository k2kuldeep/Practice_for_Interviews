import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> list = inTraversal(root);
        System.out.println(list);
    }

    //Inorder = left , root , right
    private static List<Integer> inTraversal(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null)
            return list;

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current!=null || stack.size()>0) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }

        return list;
    }
}

/*ALGO -
   1. Create a stack
   2. Initialize current as root
   3. push current node to stack and
   set current = current.left until current is null
   4. if current is null and stack is not empty then
        pop the top item
        print popped item and set current = popped.right
        go to step 3
   5.  when current is null and stack is empty , we are done
   */
