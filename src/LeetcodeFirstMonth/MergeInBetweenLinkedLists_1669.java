package LeetcodeFirstMonth;

public class MergeInBetweenLinkedLists_1669 {

    public static ListNode mergeInBetweenLists(ListNode list1, int a, int b, ListNode list2){

        // Ath and Bth node not the A and B node you stupid!!!!
        // update: Fixed it.

        /*
        Runtime: 2 ms, faster than 86.58% of Java online submissions for Merge In Between Linked Lists.
Memory Usage: 45.8 MB, less than 88.72% of Java online submissions for Merge In Between Linked Lists.
         */
        ListNode startingNode = null;
        ListNode endingNode = null;
         int index = 0;
        for(ListNode node = list1; node != null; node = node.next){
            index++;
            if(index == a){
                startingNode = node;
                continue;
            }
            if(index == b){
                endingNode = node.next;
            }
        }
        ListNode tailOfList2;
        for(tailOfList2 = list2; tailOfList2.next != null; tailOfList2 = tailOfList2.next)
        startingNode.next = list2;
        tailOfList2.next = endingNode.next;

        return list1;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(9);

        ListNode list2 = new ListNode(1000);
        list2.next = new ListNode(1001);
        list2.next.next = new ListNode(1002);

        ListNode newList = mergeInBetweenLists(list, 1, 3, list2);

        for(ListNode node = newList; node != null; node = node.next){
            System.out.print(node.val + " ");
        }

    }
}
