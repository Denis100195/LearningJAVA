package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    //iterative method
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()){
            if (current != null){
                stack.push(current);
                result.add(0, current.val);
                current = current.right;
            }
            else {
                current = stack.pop();
                current = current.left;
            }
        }
        return result;
    }

    //Recursive method
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        if (root == null) {
            return vals;
        }
        vals.addAll(postorderTraversal2(root.left));
        vals.addAll(postorderTraversal2(root.right));
        vals.add(root.val);
        return vals;
    }
}
