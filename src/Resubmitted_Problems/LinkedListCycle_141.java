package Resubmitted_Problems;

public class LinkedListCycle_141 {
    /*
    Runtime
0 ms
Beats
100%
Memory
43.4 MB
Beats
90.72%
     */
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(head != null){
            if(fast.next == null){
                return false;
            }
            if(fast.next.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
