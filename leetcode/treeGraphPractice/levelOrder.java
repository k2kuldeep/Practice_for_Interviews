/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> list = levelOrder(root);
        System.out.println(list);

    }

    private static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)
            return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currentlevel = new ArrayList<>();
            for (int i=0;i<size;i++){
                Node current = q.poll();
                currentlevel.add(current.val);

                if (current.left!=null){
                    q.add(current.left);
                }

                if (current.right!=null){
                    q.add(current.right);
                }
            }

                result.add(currentlevel);
        }

        return result;
    }
}
