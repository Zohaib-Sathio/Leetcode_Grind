package LeetcodeFirstMonth;

public class InsertionSortList_147 {

    //Solution by me
//    Runtime: 101 ms, faster than 5.16% of Java online submissions for Insertion Sort List.
//    Memory Usage: 44.7 MB, less than 53.04% of Java online submissions for Insertion Sort List.
    public static ListNode insertionSortList(ListNode list){

        for(ListNode listNode = list; listNode != null; listNode = listNode.next){
            ListNode pointer1 = list, pointer2 = list.next;
            while (pointer1.next != null){
                if(pointer1.val > pointer2.val){
                    int temp = pointer1.val;
                    pointer1.val = pointer2.val;
                    pointer2.val = temp;
                }
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(-1);
        list.next = new ListNode(5);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(0);

        list = insertionSortList(list);
        for(ListNode listNode = list; listNode != null; listNode = listNode.next){
            System.out.println(listNode.val);
        }
    }
}
