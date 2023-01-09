package Resubmitted_Problems;

public class MergeInBetweenLinkedLists_1669 {
    /*
    Runtime
1 ms
Beats
100%
Memory
45.9 MB
Beats
80.23%
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2end = list2;
        ListNode toReturn = list1;
        while(list2end.next != null){
            list2end = list2end.next;
        }
        int index = 0;
        ListNode first = list1;
        ListNode second = list2;;
        while(list1 != null){
            index++;
            if(index == a){
                first = list1;
            }
            if(index-1 == b){
                second = list1.next;
                break;
            }

            list1 = list1.next;
        }
        first.next = list2;
        list2end.next = second;
        return toReturn;
    }
}
