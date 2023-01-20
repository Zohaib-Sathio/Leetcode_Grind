package HARD_Problems;


public class MergeKSortedLists_23 {

    /*
    Runtime
191 ms
Beats
13.82%
Memory
44.5 MB
Beats
51.15%
     */
    public static ListNode mergeKLists(ListNode[] lists){
        ListNode listNode = null;
        for (ListNode list : lists) {
            if(list != null)
                listNode = mergeTwoLists(listNode, list);
        }
        return listNode;
    }

    // 1 7   1 4   3 2 6
    // 0 1 7    14  3 2 6
    // 0 1 1 4 7    3 2 6
    //       X      Y

    // 0 1 1 2 3 4 6 7
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
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
        ListNode list = new ListNode(2);
//        list.next = new ToSolveLater.ListNode(7);

        ListNode list2 = new ListNode();
//        list2.next = new ToSolveLater.ListNode(4);

        ListNode list3 = new ListNode(-1);
//        list3.next = new ToSolveLater.ListNode(3);
//        list3.next.next = new ToSolveLater.ListNode(6);

        ListNode[] listNodes = {list, list2, list3};
        ListNode mergedKLists = mergeKLists(listNodes);
        for (ListNode node = mergedKLists; node != null; node = node.next) {
            System.out.print(node.val + " ");
        }
    }
}
