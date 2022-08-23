public class AddTwoNumbers_02 {

//    Wrong Answer
//    Details
//            Input
//[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
//        [5,6,4]
//    Output
//[2,8,0,4,6,2,5,0,3,0,7,2,4,4,9,6,7,0,5]
//    Expected
//[6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
//    Time Submitted
//    Status
//            Runtime
//    Memory
//            Language
//07/17/2022 23:06	Wrong Answer	N/A	N/A	java
//07/17/2022 23:03	Wrong Answer	N/A	N/A	java

    public static ListNode addTwoNumbers(ListNode list1, ListNode list2){
        long tenthNo = 1;
        long firstNum = 0;
        long secondNum = 0;
        for(ListNode node = list1; node != null; node = node.next){
            firstNum += node.val*tenthNo;
            tenthNo *= 10;
        }
        tenthNo = 1;
        for(ListNode node = list2; node != null; node = node.next){
            secondNum += node.val*tenthNo;
            tenthNo *= 10;
        }
        long addedNumber = firstNum + secondNum;
        String numberString = String.valueOf(addedNumber);
        ListNode newList = new ListNode(0);
        ListNode temp = newList;
        for (int i = numberString.length()-1; i >= 0; i--) {
            int n = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            temp.next = new ListNode(n);
            temp = temp.next;
        }
        return newList.next;
    }
    public ListNode addTwoNumber2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p, dummy = new ListNode(0);
        p = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(carry%10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode p, dummy = new ListNode(0);
//        p = dummy;
//        while (l1 != null || l2 != null || carry != 0) {
//            if (l1 != null) {
//                carry += l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                carry += l2.val;
//                l2 = l2.next;
//            }
//            p.next = new ListNode(carry%10);
//            carry /= 10;
//            p = p.next;
//        }
//        return dummy.next;
//    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(9);
        list.next.next = new ListNode(9);
        list.next.next.next = new ListNode(9);
        list.next.next.next.next = new ListNode(9);
        list.next.next.next.next.next = new ListNode(9);
        list.next.next.next.next.next.next = new ListNode(9);
        list.next.next.next.next.next.next.next = new ListNode(9);
        list.next.next.next.next.next.next.next.next = new ListNode(9);
        list.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode list2 = new ListNode(9);
//        list.next = new ListNode(6);
//        list.next.next = new ListNode(4);

        ListNode list3 = addTwoNumbers(list, list2);
        for(ListNode node = list3; node != null; node = node.next){
            System.out.print(node.val + " ");
        }
    }
}
