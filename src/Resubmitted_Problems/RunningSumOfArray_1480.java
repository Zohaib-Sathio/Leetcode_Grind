package Resubmitted_Problems;

public class RunningSumOfArray_1480 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 43.7 MB, less than 18.97% of Java online submissions for Running Sum of 1d Array.
     */
    public int[] runningSum(int[] nums) {
        int[] returnArr = new int[nums.length];
        returnArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            returnArr[i] = returnArr[i-1] + nums[i];
        }
        return returnArr;
    }
}
