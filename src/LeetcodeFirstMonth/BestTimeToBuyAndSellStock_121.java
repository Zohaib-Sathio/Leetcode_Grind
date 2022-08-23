package LeetcodeFirstMonth;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock_121 {
    /*
    Runtime: 4 ms, faster than 30.53% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 84.1 MB, less than 33.33% of Java online submissions for Best Time to Buy and Sell Stock.
     */

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leastSoFar = Integer.MAX_VALUE;
        int todayProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            ArrayList l = new ArrayList();
            todayProfit = prices[i] - leastSoFar;
            if(maxProfit < todayProfit){
                maxProfit = todayProfit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

    }
}
