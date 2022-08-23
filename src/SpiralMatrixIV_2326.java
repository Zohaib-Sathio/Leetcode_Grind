public class SpiralMatrixIV_2326 {

    public static int[][] spiralMatricx(int m, int n, ListNode list){
        int[][] spiralMatrix = new int[m][n];

        int row = 0, col = 0;
        for(ListNode node = list; node != null; node = node.next){
            spiralMatrix[row][col] = node.val;
            if(col < n-1){
                col++;
            }
            else if (col == n-1 && row < m-1){
                row++;
            }
            else if(col == n-1 && row == m-1){
                col--;
            }
        }

        return spiralMatrix;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(5);
        int m = 2, n = 4;
    }
}
