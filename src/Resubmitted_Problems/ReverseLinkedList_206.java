package Resubmitted_Problems;

public class ReverseLinkedList_206 {
    /*
    Runtime
0 ms
Beats
100%
Memory
41.8 MB
Beats
94.35%
     */
    public ListNode reverseList(ListNode head) {
        ListNode start = null;
        ListNode temp = head;
        while(temp != null){
            ListNode temp2 = temp.next;
            temp.next = start;
            start = temp;
            temp = temp2;
        }
        return start;
    }
}
