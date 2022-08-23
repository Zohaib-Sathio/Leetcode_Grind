package LeetcodeFirstMonth;

public class RichestCustomerWealth_1672 {
    /*
    Runtime: 1 ms, faster than 52.26% of Java online submissions for Richest Customer Wealth.
Memory Usage: 43.1 MB, less than 67.90% of Java online submissions for Richest Customer Wealth.
     */
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0, customerWealth = 0;
        for(int[] customer : accounts){
            customerWealth = 0;
            for(int rs : customer){
                customerWealth += rs;
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        return maxWealth;
    }
    public static void main(String[] args) {

    }
}
