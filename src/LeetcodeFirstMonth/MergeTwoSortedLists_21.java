package LeetcodeFirstMonth;

public class MergeTwoSortedLists_21 {

    /*
    Runtime: 1 ms, faster than 78.95% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 43.1 MB, less than 50.19% of Java online submissions for Merge Two Sorted Lists.
     */
    public static ListNode mergeLists(ListNode list1, ListNode list2){
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        ListNode ptr1 = list1, ptr2 = list2;
        while (ptr1 != null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                head.next = ptr1;
                ptr1 = ptr1.next;
            }
            else{
                head.next = ptr2;
                ptr2 = ptr2.next;
            }
            head = head.next;
        }
        while (ptr1 != null){
            head.next = ptr1;
            ptr1 = ptr1.next;
            head = head.next;
        }
        while (ptr2 != null){
            head.next = ptr2;
            ptr2 = ptr2.next;
            head = head.next;
        }


        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[2];
        System.out.println(listNodes.length);

        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(5);

        ListNode mergedList = mergeLists(list, list2);
        for (ListNode node = mergedList; node != null; node = node.next) {
            System.out.print(node.val + " ");
        }
    }
}
