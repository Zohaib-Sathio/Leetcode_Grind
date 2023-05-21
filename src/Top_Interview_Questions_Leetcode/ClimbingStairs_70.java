package Top_Interview_Questions_Leetcode;

public class ClimbingStairs_70 {
    /*
    Runtime
0 ms
Beats
100%
Memory
39.6 MB
Beats
44.99%
     */

    public static int climbStairs(int n) {
        int[] dp = new int[47];
        return rec(0,n, dp);
    }
    public static int rec(int steps, int n, int[] dp){
        if(steps == n){
            return 1;
        }
        if(steps > n){
            return 0;
        }
        if(dp[steps+1] != 0 && dp[steps+2] != 0){
            return dp[steps+1] + dp[steps+2];
        }
        else if(dp[steps+1] != 0){
            return dp[steps+1] + rec(steps+2, n, dp);
        }
        else if(dp[steps+2] != 0){
            return dp[steps+2] + rec(steps+1, n, dp);
        }
        dp[steps+1] = rec(steps+1, n, dp);
        dp[steps+2] = rec(steps+2, n, dp);
        return dp[steps+1] + dp[steps+2];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
