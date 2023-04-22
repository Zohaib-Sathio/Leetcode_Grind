package SuccessfullySubmittedProblems;

public class left_and_right_sum_differences_2574 {
    /*
    Runtime
1 ms
Beats
99.98%
Memory
43.2 MB
Beats
43.18%
     */
    public int[] leftRigthDifference(int[] nums) {
        int[] returnArr = new int[nums.length];
        int index = 0;
        int sum = 0;
        int leftSum = 0;
        for(int num : nums){
            sum+= num;
        }
        for(int i = 0; i < nums.length;i++){
            int ans = sum - nums[i] - leftSum;
            if(ans < 0){
                ans *= -1;
            }
            leftSum += nums[i];
            sum -= nums[i];
            returnArr[index++] = ans;
        }
        return returnArr;
    }
}
