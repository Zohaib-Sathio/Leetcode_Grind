public class RotateList_61 {
    public static ListNode rotateList(ListNode head, int kTimes){
        while (kTimes > 0){
            ListNode lastNode;
            for (lastNode = head; lastNode.next.next != null; lastNode = lastNode.next){
                System.out.println(lastNode.val);
            }
            lastNode.next.next = head;
            head = lastNode.next;
            lastNode = null;
            kTimes--;
        }
        return head;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int size = 1; // since we are already at head node
        ListNode fast=head;
        ListNode slow = head;

        while(fast.next!=null){
            size++;
            fast = fast.next;
        }

        for(int i=size-k%size;i>1;i--) // i>1 because we need to put slow.next at the start.
            slow = slow.next;

        // No dummy variable.
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
    // 1 2 3 4 5 6
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);

        list = rotateList(list, 2);
        for (ListNode node = list; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
