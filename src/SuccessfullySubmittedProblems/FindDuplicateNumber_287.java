package SuccessfullySubmittedProblems;

import java.util.HashSet;

public class FindDuplicateNumber_287 {
    /*
    Runtime
23 ms
Beats
35.63%
Memory
59 MB
Beats
95.76%
     */
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int j : nums){
            if(set.contains(j)){
                return j;
            }
            else{
                set.add(j);
            }
        }
        return -1;
    }


    /*
    Runtime
3 ms
Beats
96.20%
Memory
60.2 MB
Beats
64.14%
     */
    //This works only because elements are in range of 1-n!
    public int findDuplicate2(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return len;
    }
}
