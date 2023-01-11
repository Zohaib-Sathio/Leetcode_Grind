package Resubmitted_Problems;

public class MiddleOfTheLinkedList_876 {
    /*
    Runtime
0 ms
Beats
100%
Memory
39.8 MB
Beats
84.94%
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
