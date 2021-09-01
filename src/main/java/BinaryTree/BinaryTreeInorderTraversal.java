package BinaryTree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addRoot(root, list);
        return list;
    }

    //Recursion
    public void addRoot(TreeNode root, List<Integer> result){
        if (root != null){
            if (root.left != null){
                addRoot(root.left, result);
            }
            result.add(root.val);
            if (root.right != null){
                addRoot(root.right, result);
            }
        }
    }
    //Iterating method using Stack
    public List<Integer> inorderTraversalStack(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
