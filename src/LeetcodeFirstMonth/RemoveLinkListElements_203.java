package LeetcodeFirstMonth;

public class RemoveLinkListElements_203 {
    /*
    Runtime: 3 ms, faster than 18.75% of Java online submissions for Remove Linked List Elements.
Memory Usage: 49.8 MB, less than 5.32% of Java online submissions for Remove Linked List Elements.
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode list = new ListNode(-1);
        ListNode temp = list;
        for(ListNode node = head; node != null; node = node.next){
            if(node.val != val){
                list.next = new ListNode(node.val);
                list = list.next;
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {

    }
}
