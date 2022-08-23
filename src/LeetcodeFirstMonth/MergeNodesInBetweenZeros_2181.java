package LeetcodeFirstMonth;

public class MergeNodesInBetweenZeros_2181 {

    /*
    Runtime: 12 ms, faster than 53.33% of Java online submissions for Merge Nodes in Between Zeros.
Memory Usage: 299.6 MB, less than 46.04% of Java online submissions for Merge Nodes in Between Zeros.
     */

    public static ListNode mergeNodes(ListNode head){
        ListNode newList = new ListNode(0);
        ListNode ptr1 = head;
        ListNode temp = newList;
        ListNode ptr2 = head.next;
        int totalSum = 0;
        while (ptr1.next != null){
            totalSum += ptr2.val;
            if(ptr2.val == 0){
                temp.next = new ListNode(totalSum);
                temp = temp.next;
                totalSum = 0;
                ptr1 = ptr2;
            }
            ptr2 = ptr2.next;
        }
        return newList.next;
    }

    // 0 3 1 0 4 5 2 0

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(3);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(0);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next.next = new ListNode(2);
        list.next.next.next.next.next.next.next = new ListNode(0);

        System.out.println(mergeNodes(list));

        ListNode p = mergeNodes(list);

        for (ListNode node = p; node != null; node = node.next) {
            System.out.println(p.val);
        }



    }
}
