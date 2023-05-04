package GeeksForGeeks_Daily;

import java.util.Arrays;

public class MinimizeNumberofStudentstobeRemoved {
    // Saw the solution
    private static int lengthOfLIS(int[] nums){
        int[] dp = new int[nums.length];
        int len = 0;
        for(int num : nums){
            int i = Arrays.binarySearch(dp, 0, len, num);
            if(i < 0){
                i = -(i + 1);
            }
            dp[i] = num;
            if(i == len){
                len++;
            }
        }
        return len;
    }
    public int removeStudents(int[] H, int N) {
        // code here
        int count = N - lengthOfLIS(H);
        return count;
    }

}
