package SuccessfullySubmittedProblems;

public class FindMinimumInRotatedSortedArray_153 {
    /*
    Runtime
0 ms
Beats
100%
Memory
42.1 MB
Beats
64.90%
     */
    public int findMin(int[] nums) {
        int count = 1;
        int first = nums[0];
        for(int i = 1; i< nums.length; i++){
            if(first > nums[i]) return nums[count];
            count++;
        }
        if(count == nums.length) return nums[0];
        return nums[count-1];
    }
}
