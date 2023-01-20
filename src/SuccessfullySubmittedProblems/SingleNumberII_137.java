package SuccessfullySubmittedProblems;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumberII_137 {
    /*
    Runtime
3 ms
Beats
82.81%
Memory
41.3 MB
Beats
99.50%
     */
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=3){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    /*
    Runtime
5 ms
Beats
51.86%
Memory
41.5 MB
Beats
96.19%
     */
    public int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
