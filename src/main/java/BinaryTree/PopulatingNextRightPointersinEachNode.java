package BinaryTree;

public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        if(root != null) {
            // connect left child next to right child
            if(root.left != null) {
                root.left.next = root.right;
            }
            //connect right child next to left child of own next node
            if(root.right != null && root.next != null) {
                root.right.next = root.next.left;
            }
            connect(root.left);
            connect(root.right);
        }
        return root;
    }
}
