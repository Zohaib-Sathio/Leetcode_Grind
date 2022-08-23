package LeetcodeFirstMonth;

public class DeleteNodeInALinkedList_237 {

    //Strange solution but logical
    //From leetcode
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    //Since we couldn't enter the preceding node, we can not delete the given node.
    //We can just copy the next node to the given node and delete the next one.

    public static ListNode deleteNode(ListNode list, int nodeToDelete){

        //When target is head of the list!!!
        if(list.val == nodeToDelete){
            return list.next;
        }

        for(ListNode node = list; node.next != null; node = node.next){

            if(node.next.val == nodeToDelete){
                node.next = node.next.next;
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(5);

        list = deleteNode(list, 5);
        for(ListNode node = list; node != null; node = node.next){
            System.out.print(node.val + " ");
        }
    }
}
