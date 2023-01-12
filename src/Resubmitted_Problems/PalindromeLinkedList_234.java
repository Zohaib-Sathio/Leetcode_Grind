package Resubmitted_Problems;

import java.util.Stack;

public class PalindromeLinkedList_234 {
    /*
    Runtime
18 ms
Beats
43.98%
Memory
57.8 MB
Beats
85.5%
     */
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        int count = 0;
        ListNode temp2 = head;
        while(temp2 != null){
            count++;
            temp2 = temp2.next;
        }
        int half = count/2;
        Stack<Integer> stack = new Stack();
        while(half > 0){
            stack.push(head.val);
            head = head.next;
            half--;
        }
        if(count % 2 != 0){
            head = head.next;
        }

        while(head != null){
            if(stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
