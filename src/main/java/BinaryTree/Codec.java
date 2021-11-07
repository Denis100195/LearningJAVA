package BinaryTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
//         if the root would be null we need a null string.
            if (root == null) return "null";
//         Assuming: Recursion will handle this for us.
            String left = serialize(root.left);
            String right = serialize(root.right);
//         [1,2,3,null,null,4,5]
            return root.val + "," + left + "," + right;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            Queue<String> q = new LinkedList<>();
            q.addAll(Arrays.asList(data.split(",")));
            return helper(q);
        }

        public TreeNode helper(Queue<String> q) {
            String valueForNode = q.poll(); // taking out the front from the queue

            if (valueForNode.equals("null")) return null; // if the node is null string we return null.

//         Creating a new node with the value we get from the queue.
            TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode)); // Parsing
//         Recursion: Handle for us
            newNode.left = helper(q);
            newNode.right = helper(q);

            return newNode;
        }
    }



// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

