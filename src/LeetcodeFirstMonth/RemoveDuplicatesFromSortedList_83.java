package LeetcodeFirstMonth;

public class RemoveDuplicatesFromSortedList_83 {

    /*
    Runtime: 1 ms, faster than 77.89% of Java online submissions for Remove Duplicates from Sorted List.
Memory Usage: 44.4 MB, less than 28.77% of Java online submissions for Remove Duplicates from Sorted List.
     */

    public static ListNode removeDuplicates(ListNode head){
        ListNode newList = new ListNode(-1);
        ListNode node = newList;
        for (ListNode listNode = head; listNode != null; listNode = listNode.next) {
            if(listNode.next == null){
                node.next = new ListNode(listNode.val);
            }
            else if(listNode.val != listNode.next.val){
                node.next = new ListNode(listNode.val);
                node = node.next;
            }
        }
        return newList.next;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next.next = new ListNode(5);

        list = removeDuplicates(list);

        for (ListNode node = list; node != null; node = node.next) {
            System.out.println(node.val);
        }


    }


// In-place java solution from leetcode
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while(list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    } }