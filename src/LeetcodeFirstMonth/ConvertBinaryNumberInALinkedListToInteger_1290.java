package LeetcodeFirstMonth;

import java.util.HashMap;

public class ConvertBinaryNumberInALinkedListToInteger_1290 {

//    Runtime: 1 ms, faster than 36.86% of Java online submissions for Convert Binary Number in a Linked List to Integer.
//    Memory Usage: 42.3 MB, less than 13.14% of Java online submissions for Convert Binary Number in a Linked List to Integer.

    public static int getDecimalNumberFromList(ListNode head){
        int decimalNumber = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int idx = 0;

        for(ListNode node = head; node != null; node = node.next){
            hashMap.put(idx++, node.val);
        }

        int squaringNumber = 0;

        for (int i = idx - 1; i >= 0; i--) {
            if(hashMap.get(i) == 1){
                decimalNumber += squareOfNumber(squaringNumber);
            }
            squaringNumber++;
        }

        return decimalNumber;
    }
    private static int squareOfNumber(int squaringNum){
        int num = 1;
        while (squaringNum > 0){
            num *= 2;
            squaringNum--;
        }
        return num;
    }


    // From Leetcode
    public int getDecimalValue2(ListNode head) {
        int res = 0;

        while(head!=null){
            res = res<<1 | head.val;   // res = res*2 + head.val;
            head = head.next;
        }

        return res;
    }

    public int getDecimalValue(ListNode head) {
        int res = 0;

        while(head!=null){
            res = res*2 + head.val;
            head = head.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(0);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(1);
        System.out.println(getDecimalNumberFromList(list));
    }
}
