package Resubmitted_Problems;

import java.util.Stack;

public class MaximumTwinSumOfALinkedList_2130 {
    /*
    Runtime
44 ms
Beats
25.55%
Memory
61 MB
Beats
96.84%
     */
    public int pairSum(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int half = count/2;
        Stack<Integer> stack = new Stack();
        while(half > 0){
            stack.push(head.val);
            head = head.next;
            half--;
        }
        int sum = 0;

        while(head != null){
            int num = stack.pop();
            int newNum = num + head.val;
            sum = Math.max(newNum, sum);
            head = head.next;
        }
        return sum;
    }
}
