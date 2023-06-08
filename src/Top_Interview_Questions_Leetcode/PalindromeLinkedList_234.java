package Top_Interview_Questions_Leetcode;

public class PalindromeLinkedList_234 {
    /*
    Runtime
4 ms
Beats
85.69%
Memory
56.9 MB
Beats
76.89%
     */
    public boolean isPalindrome(ListNode head) {
        int total = 0;
        ListNode temp = head;
        while(temp != null){
            total++;
            temp = temp.next;
        }
        int[] arr = new int[total];
        int index = 0;
        while(head != null){
            arr[index] = head.val;
            index++;
            head = head.next;
        }
        int first = 0;
        int last = total-1;
        while(first <= last){
            if(arr[first] != arr[last]) return false;
            first++;
            last--;
        }
        return true;
    }
}
