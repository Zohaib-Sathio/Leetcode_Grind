package LeetcodeFirstMonth;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber_268 {
    //First approach O(nlogn)

//    Runtime: 11 ms, faster than 8.82% of Java online submissions for Missing Number.
//    Memory Usage: 51 MB, less than 51.95% of Java online submissions for Missing Number.
    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    //Second approach (Looking for linear time complexity)

    //  SOLUTION FROM LEETCODE

//    Pretty simple since we are told that we are missing only one number in [1,n], we just need to look at the difference between the sum([1,n]) = n * (n+1) / 2 and the sum of nums in our array.
//
//    public class Solution {
//        public int missingNumber(int[] nums) {
//            int sum = 0;
//            for(int num: nums)
//                sum += num;
//
//            return (nums.length * (nums.length + 1) )/ 2 - sum;
//        }
//    }
//    With a slight mod to the return statement the situation for large n is taken care of. The needed modification is
//
//return ( (nums.length * (nums.length + 1) ) - 2 * sum ) / 2;

    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
}
