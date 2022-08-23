package LeetcodeFirstMonth;

import java.util.HashMap;

public class TwoSum_01 {
    /*
    Runtime: 4 ms, faster than 75.63% of Java online submissions for Two Sum.
Memory Usage: 46.3 MB, less than 14.20% of Java online submissions for Two Sum.
     */

    public int[] twoSum(int[] nums, int target) {
        // 2 7 11 9
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{i, map.get(nums[i])};
            }
            int complement = target - nums[i];
            map.put(complement, i);
        }
        return null;
    }
}
