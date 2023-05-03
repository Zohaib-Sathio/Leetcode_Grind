package Top_Interview_Questions_Leetcode;

public class OddEvenLinkedList_328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode ans = odd;
        ListNode even = new ListNode(-2);
        ListNode temp = even;
        int index = 0;
        // -1 1 3 2 O
        // -1t 2 E
        // 1 2 3
        //       -
        while(head != null){
            if(index % 2 == 0){
                odd.next = new ListNode(head.val);
                odd = odd.next;
                head = head.next;
                index++;
            }
            else{
                even.next = new ListNode(head.val);
                even = even.next;
                head = head.next;
                index++;
            }
        }
        odd.next = temp.next;
        return ans.next;
    }
    //Solution from leetcode
    public ListNode oddEvenList2(ListNode head) {
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
