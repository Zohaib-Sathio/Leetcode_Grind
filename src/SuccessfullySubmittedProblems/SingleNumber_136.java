package SuccessfullySubmittedProblems;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber_136 {

/*
Runtime
6 ms
Beats
56.38%
Memory
42.5 MB
Beats
65.48%
 */

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                i++;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
        /*
    Runtime
9 ms
Beats
39.33%
Memory
43.1 MB
Beats
49.29%
     */

    public int singleNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int j : nums){
            if(set.contains(j)){
                set.remove(j);
            }
            else{
                set.add(j);
            }
        }
        for(int j : nums){
            if(set.contains(j))
                return j;
        }
        return -1;
    }

    /*
    Runtime
1 ms
Beats
100%
Memory
42.1 MB
Beats
96.9%
     */

    public int singleNumber3(int[] nums) {
        int ans = 0;
        for(int j : nums)
            ans ^= j;
        return ans;
    }
}
