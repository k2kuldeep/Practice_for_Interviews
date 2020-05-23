import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> list = poTraversal(root);
        System.out.println(list);
    }

    //postorder = left , right , root
    private static List<Integer> poTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while(!stack1.isEmpty()){
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left!=null)
                stack1.push(current.left);
            if (current.right!= null)
                stack1.push(current.right);

        }

        while (!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }

        return list;
    }
}

/*ALGO -
  1. Make two stack
  2. push root to first stack.
  3. loop while first stack is not empty
     pop node from first stack and push to 2nd stack
     push left and right children of popped node to first stack
  4. print contents of 2nd stack.
  */
