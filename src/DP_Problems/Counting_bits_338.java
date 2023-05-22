package DP_Problems;

public class Counting_bits_338 {
    public int[] countBits(int n) {
        int bits = 0;
        int offset = 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            if(offset * 2 == i){
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
