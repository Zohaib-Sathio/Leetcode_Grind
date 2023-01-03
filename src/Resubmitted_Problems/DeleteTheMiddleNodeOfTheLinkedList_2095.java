package Resubmitted_Problems;

public class DeleteTheMiddleNodeOfTheLinkedList_2095 {
    /*
    Runtime
4 ms
Beats
91.66%
Memory
63.9 MB
Beats
72.16%
     */
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode temp = head;
        while(true){
            if(fast.next == null){
                slow.next= slow.next.next;
                break;
            }
            if(fast.next.next == null){
                slow.next= slow.next.next;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return temp;
    }
}
