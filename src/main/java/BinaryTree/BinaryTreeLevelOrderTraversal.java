package BinaryTree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    //recursive method
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        return levelAdd(root, 0, result);// assign root at level 0
    }

    public List<List<Integer>> levelAdd(TreeNode root, int level, List<List<Integer>> result){
        if (root == null) return result;
        if (result.size() == level) result.add(new ArrayList<>());// if current level's list is not present, then add it

        List<Integer> curr = result.get(level);
        curr.add(root.val);
        result.set(level, curr);

        result = levelAdd(root.left, level + 1, result);
        result = levelAdd(root.right, level + 1, result);

        return result;
    }

    //iterative method
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if(root == null) {
            List<List<Integer>> baseList = new ArrayList<>();
            return baseList;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        while(queue.size()>0){
            int qs = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<=qs;i++) {
                TreeNode front  = queue.remove();
                list.add(front.val); //list add
                //add children to queue
                if(front.left != null)
                    queue.add(front.left);
                if(front.right != null)
                    queue.add(front.right);
            }
            ans.add(list);
        }
        return ans;

    }
}
