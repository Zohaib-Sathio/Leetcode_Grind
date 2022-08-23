public class SwapNodesInPairs_24 {

    public static ListNode swapNodes(ListNode head){
        ListNode ptr1 = head, ptr2 = head.next;
        while (true){
            ListNode temp = ptr1;
            ptr1 = ptr2;
            ptr2 = temp;
            if(ptr1.next == null){
                break;
            }
            if(ptr2.next == null){
                break;
            }
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);

        ListNode swappedList = swapNodes(list);

        for (ListNode node = swappedList; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
