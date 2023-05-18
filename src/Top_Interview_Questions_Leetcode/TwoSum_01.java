package Top_Interview_Questions_Leetcode;

import java.util.HashMap;

public class TwoSum_01 {
    //First Solution
    /*
    Runtime
85 ms
Beats
25.40%
Memory
43.1 MB
Beats
31%
     */
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }
    // Second Solution
    /*
    Runtime
1 ms
Beats
99.41%
Memory
42.8 MB
Beats
68.27%
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target-nums[i], i);
        }
        return nums;
    }
}
