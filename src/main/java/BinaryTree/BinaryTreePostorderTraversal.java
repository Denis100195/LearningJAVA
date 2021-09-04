package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()){
            result.add(current.val);

            if (root.left != null) {
                stack.push(root.left);
            }
        }
    }
    //Recursive method
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        if (root == null) {
            return vals;
        }
        vals.addAll(postorderTraversal(root.left));
        vals.addAll(postorderTraversal(root.right));
        vals.add(root.val);
        return vals;
    }
}
