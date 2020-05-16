public class TreeTraversal {

    Node root;
    TreeTraversal(){
        root = null;
    }

    void printPreorder(Node node){
        if (node == null)
            return;

        System.out.print(node.val+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder(Node node){
        if (node == null)
            return;

        printPreorder(node.left);
        System.out.print(node.val+" ");
        printPreorder(node.right);
    }

    void printPostorder(Node node){
        if(node == null)
            return ;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.val+" ");
    }

    public static void main(String[] args) {

        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder");
        tree.printPreorder(tree.root);
        System.out.println("Inorder");
        tree.printInorder(tree.root);
        System.out.println("Postorder");
        tree.printPostorder(tree.root);
    }
}

class Node{
    int val;
    Node left,right;
    Node(int d){
        val = d;
        left=right=null;
    }
}
