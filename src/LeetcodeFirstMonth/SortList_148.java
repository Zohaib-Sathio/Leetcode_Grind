package LeetcodeFirstMonth;

//Submitted Successfully
//Runtime: 17 ms, faster than 54.84% of Java online submissions for Sort List.
//Memory Usage: 80.8 MB, less than 11.36% of Java online submissions for Sort List.

public class SortList_148 {
    public static ListNode sortList(ListNode list){
        if(list == null || list.next == null)
        return list;

        ListNode prev = null, slow = list, fast = list;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(list);
        ListNode l2 = sortList(slow);

        return merger(l1, l2);
    }

    public static ListNode merger(ListNode list1, ListNode list2){
        ListNode newList = new ListNode(0);

        ListNode pointer = newList;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }
            else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        if(list1 != null)
            pointer.next = list1;
        if(list2 != null)
            pointer.next = list2;

        return newList.next;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(4);
        list.next = new ListNode(2);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(3);

        list = sortList(list);

        ListNode p = list;

        for (int i = 0; i < 4; i++) {
            System.out.println(p.val);
            p = p.next;
        }

    }
}
