package LeetcodeFirstMonth;

import java.util.HashMap;

public class PalindromeLinkedList_234 {

    /*
    Runtime: 86 ms, faster than 5.15% of Java online submissions for Palindrome Linked List.
Memory Usage: 149.2 MB, less than 5.09% of Java online submissions for Palindrome Linked List.
     */
    public static boolean isListPalindromic(ListNode head){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int index = 0;
        for (ListNode node = head; node != null; node = node.next) {
            hashMap.put(index++, node.val);
        }
        int ptr1 = 0, ptr2 = index - 1;
        while (ptr1 <= ptr2){
            if(hashMap.get(ptr1++) != hashMap.get(ptr2--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(1);
        list.next.next.next.next.next = new ListNode(1);

        System.out.println(isListPalindromic(list));
    }
}
