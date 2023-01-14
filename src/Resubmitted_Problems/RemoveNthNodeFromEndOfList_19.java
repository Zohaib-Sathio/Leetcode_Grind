package Resubmitted_Problems;

public class RemoveNthNodeFromEndOfList_19 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.4 MB
Beats
88.63%
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(n == 1 && head.next == null){
        //     return null;
        // }
        int count = 0;
        ListNode temp = head;
        ListNode toReturn = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int Nth = count - n;
        int index = 0;
        if(Nth == index){
            return toReturn.next;
        }
        while(head != null){
            index++;
            if(index == Nth){
                head.next = head.next.next;
            }
            head = head.next;
        }

        return toReturn;
    }
}
