package LeetcodeFirstMonth;

public class RunningSumOf1DArray_1480 {
    /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 43.8 MB, less than 7.78% of Java online submissions for Running Sum of 1d Array.
     */
    public int[] runningSum(int[] nums) {
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++){
            runningSum += nums[i];
            nums[i] = runningSum;
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
