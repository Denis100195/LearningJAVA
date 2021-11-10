package Recursion;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        while (head.next != null){
            head = head.next;
            head.next = head;
        }
        return head;


    }
}
