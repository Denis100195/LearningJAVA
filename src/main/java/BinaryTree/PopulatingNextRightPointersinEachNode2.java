package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode2 {
    public Node connect(Node root){
        if(root == null)
            return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int s = queue.size();
            for(int i = 0; i < s; i++){
                Node curr = queue.remove();
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                if(i == s - 1)
                    curr.next = null;
                else
                    curr.next = queue.peek();
            }
        }
        return root;
    }
}
