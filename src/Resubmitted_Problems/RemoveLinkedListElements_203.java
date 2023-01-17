package Resubmitted_Problems;

public class RemoveLinkedListElements_203 {
    /*
    Runtime
1 ms
Beats
97.72%
Memory
42.9 MB
Beats
91.82%
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode toReturn = head;
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        if(toReturn.val == val){
            return toReturn.next;
        }
        return toReturn;
    }
}
