package Resubmitted_Problems;

public class MergeNodesInBetweenZeros_2181 {
    /*
    Runtime
8 ms
Beats
79.19%
Memory
80.2 MB
Beats
86.3%
     */
    public ListNode mergeNodes(ListNode head) {
        ListNode newList = new ListNode();
        ListNode start = newList;
        int sum = 0;
        while(head != null){
            sum += head.val;
            if(head.val== 0){
                newList.next = new ListNode(sum);
                sum = 0;
                newList = newList.next;
            }
            head = head.next;
        }
        return start.next.next;
    }
}
