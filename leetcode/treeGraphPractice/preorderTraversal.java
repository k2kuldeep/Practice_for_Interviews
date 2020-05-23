import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> list = preTraversal(root);
        System.out.println(list);
    }

    // preorder = root , left , right
    private static List<Integer> preTraversal(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null)
            return list;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);

            if (node.right!=null)
            stack.push(node.right);
            if (node.left!=null)
            stack.push(node.left);
        }

        return list;
    }
}

/*ALGO -
 1. create empty stack and push root
 2. while stack is not empty
    pop an item from stack and print it
    push right child of popped item
    push left child of popped item
*/
/* Note - Right child is pushed before left child to make sure that
    left subtree is processed first */
