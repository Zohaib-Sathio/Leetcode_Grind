package HARD_Problems;

public class FindMinimumInRotatedSortedArray_154 {
    /*
    Runtime
0 ms
Beats
100%
Memory
41.8 MB
Beats
95.35%
     */
    public int findMin(int[] nums) {
        int count = 1;
        int first = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(first > nums[i]) return nums[count];
            count++;
        }
        return first;
    }
}
