package Top_Interview_Questions_Leetcode;

import java.util.Arrays;

public class SingleNumber_136 {
    //If want to do it in linear time then use XOR
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+= 2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
