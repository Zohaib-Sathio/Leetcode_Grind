package Top_Interview_Questions_Leetcode;

import java.util.HashMap;

public class Majority_Elements_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int n : nums){
            if(map.get(n) > nums.length/2){
                return n;
            }
        }
        return -1;
    }
}
