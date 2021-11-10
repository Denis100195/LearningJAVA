package Recursion;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode();
        root = head;
        recSwap(root);
        return root;
    }

    public void recSwap(ListNode root){

        if(root==null || root.next==null)
            return;

        int temp = root.next.val;
        root.next.val = root.val;
        root.val = temp;

        recSwap(root.next.next);
    }
}
