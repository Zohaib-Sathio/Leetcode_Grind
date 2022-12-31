package Resubmitted_Problems;

public class MergeTwoSortedLists_21 {
    /*
    Runtime
0 ms
Beats
100%
Memory
41.7 MB
Beats
87.6%
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode toReturn = list;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                list.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                list.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            list = list.next;
        }
        while(list1 != null){
            list.next = new ListNode(list1.val);
            list = list.next;
            list1 = list1.next;
        }
        while(list2 != null){
            list.next = new ListNode(list2.val);
            list = list.next;
            list2 = list2.next;
        }
        return toReturn.next;
    }
}
