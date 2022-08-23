package LeetcodeFirstMonth;

public class PartitionList_86 {

    /*
    Runtime: 1 ms, faster than 69.53% of Java online submissions for Partition List.
Memory Usage: 42.8 MB, less than 30.44% of Java online submissions for Partition List.
     */

    public static ListNode partitionList(ListNode head, int x){
        ListNode lessNodes = new ListNode(-1);
        ListNode listNode = lessNodes;
        ListNode greaterNodes = new ListNode(-1);
        ListNode listNode1 = greaterNodes;
        for (ListNode node = head; node != null; node = node.next) {
            if(node.val < x){
                listNode.next = new ListNode(node.val);
                listNode = listNode.next;
            }
            else {
                listNode1.next = new ListNode(node.val);
                listNode1 = listNode1.next;
            }
        }
        listNode.next = greaterNodes.next;

        return lessNodes.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(4);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(2);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(2);

        ListNode partitionedList = partitionList(list, 3);
        for (ListNode node = partitionedList; node != null; node = node.next) {
            System.out.println(node.val);
        }

    }
}
