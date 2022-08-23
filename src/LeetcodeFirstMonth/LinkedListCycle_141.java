package LeetcodeFirstMonth;

public class LinkedListCycle_141 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
Memory Usage: 43.4 MB, less than 94.33% of Java online submissions for Linked List Cycle.
     */

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;

            fast = fast.next.next;

            if(slow == fast){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

    }
}
