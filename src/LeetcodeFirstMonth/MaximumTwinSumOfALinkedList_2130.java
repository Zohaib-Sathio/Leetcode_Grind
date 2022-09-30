package LeetcodeFirstMonth;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumTwinSumOfALinkedList_2130 {
    /*
    Runtime: 95 ms, faster than 7.19% of Java online submissions for Maximum Twin Sum of a Linked List.
Memory Usage: 173.3 MB, less than 5.01% of Java online submissions for Maximum Twin Sum of a Linked List.
     */
    public static int maximumTwinSum(ListNode list){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int index = 0;
        for(ListNode node = list; node != null; node = node.next){
            hashMap.put(index++, node.val);
        }
        int maximumTwinSum = 0;
        int idx2 = index - 1;
        for (int i = 0; i < index/2; i++) {
            int sumOfPair = hashMap.get(i) + hashMap.get(idx2--);
            maximumTwinSum = (maximumTwinSum > sumOfPair) ? maximumTwinSum : sumOfPair;
        }
        return maximumTwinSum;
    }
    public static void main(String[] args) {
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(40000);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(103420);
//        list2.next.next.next = new ToSolveLater.ListNode(4);
//        list2.next.next.next.next.next = new ToSolveLater.ListNode(6);
        System.out.println(maximumTwinSum(list2));
    }
    public int pairSum(ListNode head) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(head != null)
        {
            al.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = al.size()-1;
        int sum = 0;
        while(i < j)
        {
            sum = Math.max(al.get(i)+al.get(j), sum);
            i++;
            j--;
        }
        return sum;
    }
}
/**
 * Definition for singly-linked list.
 * public class ToSolveLater.ListNode {
 *     int val;
 *     ToSolveLater.ListNode next;
 *     ToSolveLater.ListNode() {}
 *     ToSolveLater.ListNode(int val) { this.val = val; }
 *     ToSolveLater.ListNode(int val, ToSolveLater.ListNode next) { this.val = val; this.next = next; }
 * }
 */

