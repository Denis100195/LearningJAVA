package BinaryTree;

import java.util.HashMap;

public class ConstrBTfromInandPost {
    HashMap<Integer, Integer> hm = new HashMap();
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++){
            hm.put(inorder[i],i);
        }
        return build(postorder, 0, postorder.length - 1);
    }
    private TreeNode build(int[] arr, int start, int end){
        if (start > end || index < 0) return null;
        TreeNode node = new TreeNode(arr[index--]);

        int split = hm.get(node.val);
        node.right = build(arr, split + 1, end);
        node.left = build(arr, start, split - 1);
        return node;
    }
}
