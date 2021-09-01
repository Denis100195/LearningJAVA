package BinaryTree;

import java.util.*;

public class BinaryTreePreorderTraversal {
    //Using stack
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                res.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            curr = curr.right;
        }

        return res;
    }
}
