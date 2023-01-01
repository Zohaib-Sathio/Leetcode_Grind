package Resubmitted_Problems;

public class ConvertBinaryNumberInALinkedListToInteger_1290 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.1 MB
Beats
76.28%
     */
    public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp =  temp.next;
        }
        int num = 0;
        int power = 1;
        while(count > 1){
            power *= 2;
            count--;
        }
        while(head != null){
            if(head.val == 1){
                num += power;
            }
            power /= 2;
            head = head.next;
        }
        return num;
    }
}
