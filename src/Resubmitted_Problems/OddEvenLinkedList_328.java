package Resubmitted_Problems;

public class OddEvenLinkedList_328 {
    /*
    Runtime
1 ms
Beats
61.89%
Memory
41.8 MB
Beats
87.84%
     */
    public ListNode oddEvenList(ListNode head) {
        ListNode secondList = new ListNode();
        ListNode firstList = new ListNode();
        ListNode head1 = firstList;
        ListNode head2 = secondList;
        boolean isFirst = true;
        while(head != null){
            if(isFirst){
                isFirst = false;
                firstList.next = new ListNode(head.val);
                firstList = firstList.next;
            }
            else{
                isFirst = true;
                secondList.next = new ListNode(head.val);
                secondList = secondList.next;
            }
            head = head.next;
        }
        firstList.next = head2.next;
        return head1.next;
    }
}
