package Resubmitted_Problems;

public class PartitionList_86 {
    /*
    Runtime
0 ms
Beats
100%
Memory
42 MB
Beats
69.14%
     */
    //Same as Odd Even LinkedList #328
    public ListNode partition(ListNode head, int x) {
        ListNode secondList = new ListNode();
        ListNode firstList = new ListNode();
        ListNode head1 = firstList;
        ListNode head2 = secondList;
        while(head != null){
            if(head.val < x){
                firstList.next = new ListNode(head.val);
                firstList = firstList.next;
            }
            else{
                secondList.next = new ListNode(head.val);
                secondList = secondList.next;
            }
            head = head.next;
        }
        firstList.next = head2.next;
        return head1.next;
    }
}
