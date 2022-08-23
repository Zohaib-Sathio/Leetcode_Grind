package LeetcodeFirstMonth;

public class DeleteTheMiddleNodeOfLinkedList_2095 {

//    Runtime: 7 ms, faster than 25.39% of Java online submissions for Delete the Middle Node of a Linked List.
//    Memory Usage: 214.7 MB, less than 56.03% of Java online submissions for Delete the Middle Node of a Linked List.
    public static ListNode deleteMiddleNode(ListNode head){
        //   X
        // 1 2 3 4 5 6
        //     ^   ^
        if(head.next == null){
            return null;
        }
        ListNode nodeBeforeMid;
        ListNode slow = head, fast = head;
        while (fast.next.next != null){
            nodeBeforeMid = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next == null){
                nodeBeforeMid.next = nodeBeforeMid.next.next;
                return head;
            }
        }
        slow.next = slow.next.next;
        return head;
    }
    public ListNode deleteMiddle2(ListNode head) {
        if(head.next == null){
            return null;
        }


        ListNode fast = head.next.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next =  slow.next.next;
        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        // Base Condition
        if(head == null || head.next == null) return null;
        // Pointers Created
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
//        list.next.next = new ListNode(3);
//        list.next.next.next = new ListNode(4);
//        list.next.next.next.next = new ListNode(5);
//        list.next.next.next.next.next = new ListNode(6);


        ListNode p = deleteMiddleNode(list);

        for (ListNode node = p; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
