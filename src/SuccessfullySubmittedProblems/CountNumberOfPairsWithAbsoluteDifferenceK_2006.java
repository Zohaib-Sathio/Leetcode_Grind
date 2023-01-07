package SuccessfullySubmittedProblems;

public class CountNumberOfPairsWithAbsoluteDifferenceK_2006 {
    /*
    Runtime
5 ms
Beats
82.69%
Memory
41.6 MB
Beats
94.74%
     */
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] - nums[i] == k || nums[i] - nums[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
