package DP_Problems;

public class Fibonacci_Number_509 {
    static int[] dp = new int[31];

    public static int fibNum(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        if(dp[num] != -1) return dp[num];
        dp[num] = fibNum(num-1) + fibNum(num-2);
        return dp[num];

    }
    public int fib(int n) {
        for(int i = 0; i < 31; i++){
            dp[i] = -1;
        }
        return fibNum(n);
    }
}
