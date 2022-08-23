package LeetcodeFirstMonth;

public class MiddleOfTheLinkedList_876 {

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
Memory Usage: 42 MB, less than 18.33% of Java online submissions for Middle of the Linked List.
     */

    public static ListNode middleOfTheLinkedList(ListNode head){

        if(head.next == null){
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next == null){
                return slow;
            }
        }
        return slow.next;
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);


        ListNode p = middleOfTheLinkedList(list);

        for (ListNode node = p; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
