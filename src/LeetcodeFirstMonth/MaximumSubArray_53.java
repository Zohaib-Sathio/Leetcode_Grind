package LeetcodeFirstMonth;

public class MaximumSubArray_53 {
    public static int maximumSubArray(int[] nums){
        int sum = 0, maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
            sum = 0;
        }
        return maxSum;
    }
    //From Leetcode
    /*
    Runtime: 2 ms, faster than 71.29% of Java online submissions for Maximum Subarray.
Memory Usage: 73.7 MB, less than 52.41% of Java online submissions for Maximum Subarray.
     */
    public static int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    // 3 -2 4 -1 6
    // m
    public static void main(String[] args) {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {1,2,-1,-2,2,1,-2,1,4,-5,4};
//        int[] nums = {-3};
        int[] nums = {-2, 1};
        System.out.println(maxSubArray(nums));
    }
}
