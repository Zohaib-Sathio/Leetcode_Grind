package LeetcodeFirstMonth;

public class ReverseLinkedList_206 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 43 MB, less than 49.66% of Java online submissions for Reverse Linked List.
     */

    public static ListNode reverseList(ListNode list){

        ListNode current = list;
        ListNode next;
        ListNode prev = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

        //  null 1 2 3 4
        //               c
        //             p
        // 2 1 3 4
        // c   n
        //     p
        // 3 2 1 4
        // c     n
        //       p
        // 4 3 2 1
        // c       n
        // p

    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(5);

        list = reverseList(list);

        for(ListNode node = list; node != null; node = node.next){
            System.out.println(node.val);
        }
    }

    //From Leetcode
    public ListNode reverseList2(ListNode head) {
        /* recursive solution */
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }

    //    public static ToSolveLater.ListNode reverseList(ToSolveLater.ListNode list){
//
//        ToSolveLater.ListNode prev = null;
//        ToSolveLater.ListNode current = list;
//        ToSolveLater.ListNode next = list.next;
//
//        while (current != null){
//            System.out.println("fsf");
//            ToSolveLater.ListNode ptr1 = current;
//            ToSolveLater.ListNode ptr2 = next;
//            ptr2.next = ptr1;
//            current = current.next;
//            next = next.next;
//        }

//        for(ToSolveLater.ListNode node = list; node.next != null; node = node.next){
//            ToSolveLater.ListNode temp = ptr2;
//
//            System.out.println("dfas");
//            ptr2.next = ptr1;
//            ptr1 = ptr2;
//            ptr2 = temp.next;
//        }


//        while (next != null){
//            prev = next;
//            prev.next = current;
//            current = next;
//            next = next.next;
//        }
//
//        return list;
//    }

}
