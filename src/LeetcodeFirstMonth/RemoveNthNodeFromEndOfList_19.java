package LeetcodeFirstMonth;

public class RemoveNthNodeFromEndOfList_19 {

    /*
    Runtime: 1 ms, faster than 70.27% of Java online submissions for Remove Nth Node From End of List.
Memory Usage: 42.5 MB, less than 34.87% of Java online submissions for Remove Nth Node From End of List.
     */
    public static ListNode removeNthNodeFromEnd(ListNode head, int n){
        int size = 0;
        for (ListNode node = head; node != null; node = node.next) {
            size++;
        }
        if (size == n){
            if(head != null){
                return head.next;
            }
        }
        int posFromStart = size - n;
        int idx = 0;
        for (ListNode node = head; node != null; node = node.next) {
            idx++;
            if(idx == posFromStart){
                node.next = node.next.next;
                break;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
//        list.next.next = new ToSolveLater.ListNode(3);
//        list.next.next.next = new ToSolveLater.ListNode(4);
//        list.next.next.next.next = new ToSolveLater.ListNode(5);

        ListNode list2 = removeNthNodeFromEnd(list, 2);
        for (ListNode node = list2; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
