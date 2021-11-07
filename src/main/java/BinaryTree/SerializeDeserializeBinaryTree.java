package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinaryTree {

    public String serialize(TreeNode root) {

        if(root == null) return "";

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder s = new StringBuilder();

        q.offer(root);

        while(!q.isEmpty()) {

            TreeNode front = q.poll();

            if(front != null) s.append(front.val + " ");
            else s.append("N ");

            if(front != null) {

                q.offer(front.left);
                q.offer(front.right);
            }
        }

        return s.toString();
    }

    public TreeNode deserialize(String data) {

        if(data.length() == 0) return null;

        String values [] = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.offer(root);
        int index = 0;

        while(!q.isEmpty()){

            TreeNode front = q.poll();

            if(!values[++index].equals("N")) {

                TreeNode left = new TreeNode(Integer.parseInt(values[index]));
                front.left = left;
                q.offer(left);
            }

            if(!values[++index].equals("N")){

                TreeNode right = new TreeNode(Integer.parseInt(values[index]));
                front.right = right;
                q.offer(right);
            }
        }

        return root;
    }
}
