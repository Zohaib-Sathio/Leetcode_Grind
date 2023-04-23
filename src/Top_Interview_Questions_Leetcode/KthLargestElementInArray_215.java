package Top_Interview_Questions_Leetcode;

import java.util.Arrays;

public class KthLargestElementInArray_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
