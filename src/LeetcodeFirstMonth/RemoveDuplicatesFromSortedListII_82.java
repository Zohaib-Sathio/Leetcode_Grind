package LeetcodeFirstMonth;

public class RemoveDuplicatesFromSortedListII_82 {

    /*
    Runtime: 1 ms, faster than 82.82% of Java online submissions for Remove Duplicates from Sorted List II.
Memory Usage: 43.8 MB, less than 37.85% of Java online submissions for Remove Duplicates from Sorted List II.
     */
    public static ListNode deleteDuplicates(ListNode head){
        ListNode noDuplicatesList = new ListNode(-1);
        ListNode listNode = noDuplicatesList;
        // 1 2 2 3 3 6 9
        //             ^-^
        for (ListNode node = head; node != null; node = node.next) {
            if(node.next == null){
                listNode.next = new ListNode(node.val);
                break;
            }
            if(node.val == node.next.val){
                if(node.next.next != null){
                    if (node.next.val == node.next.next.val){
                        continue;
                    }
                }
                node = node.next;
            }
            else {
                listNode.next = new ListNode(node.val);
                listNode = listNode.next;
            }
        }
        return noDuplicatesList.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(2);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(6);
        list.next.next.next.next.next = new ListNode(9);
        list.next.next.next.next.next.next = new ListNode(9);

        ListNode removedDuplicatesList = deleteDuplicates(list);
        for (ListNode node = removedDuplicatesList; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
