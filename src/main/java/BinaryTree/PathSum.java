package BinaryTree;
/*Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
* */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //if its a last node we'll chk if target_sum-node.val equals to 0, if they are we'll simply return true
        if (root != null && root.left == null && root.right == null){
            if ((targetSum - root.val) == 0) return true;
            return false;
        }
        //if root equals to null we'll just return false
        if (root == null)return false;
        //if at any point we'll get true we'll simply return it

        //we'll say our recursion to go left
        if (hasPathSum(root.left,targetSum - root.val)) return true;
        //we'll say our recursion to go right
        if (hasPathSum(root.right,targetSum - root.val)) return true;
        //at the end we'll return false
        return false;
    }
}
