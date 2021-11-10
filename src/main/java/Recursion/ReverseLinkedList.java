package Recursion;

public class ReverseLinkedList {
    public ListNode reverseListRecursive(ListNode prev, ListNode curr){

        // Step 1: Base case
        if(curr == null){
            return prev;
        }

        // Step 2: Store next node of current node
        ListNode temp = curr.next;

        // Step 3: Set next node of current node as prev
        curr.next = prev;

        // Step 4: Updat prev node with current node value
        prev = curr;

        // Step 5: Recursive call for next node
        return reverseListRecursive(prev, temp);

    }

    public ListNode reverseList(ListNode head) {
        // Driver Function
        return reverseListRecursive(null, head);
    }
}
