package Top_Interview_Questions_Leetcode;

public class AddTwoNumbers_02 {
    /*
    Runtime
2 ms
Beats
99.5%
Memory
43.6 MB
Beats
6.51%
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(l1 != null && l2 != null){
            int num = l1.val + l2.val + rem;
            if(num > 9){
                rem = 1;
                ans.next = new ListNode(num%10);
            }
            else{
                rem = 0;
                ans.next = new ListNode(num);
            }
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int num = l1.val + rem;
            if(num > 9){
                rem = 1;
                ans.next = new ListNode(num%10);
            }
            else{
                rem = 0;
                ans.next = new ListNode(num);
            }
            ans = ans.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int num = l2.val + rem;
            if(num > 9){
                rem = 1;
                ans.next = new ListNode(num%10);
            }
            else{
                rem = 0;
                ans.next = new ListNode(num);
            }
            ans = ans.next;
            l2 = l2.next;
        }
        if(rem == 1){
            ans.next = new ListNode(rem);
        }
        return temp.next;
    }
}
