package SuccessfullySubmittedProblems;

public class CountEqualandDivisiblePairsInArray_2176 {
    /*
    Runtime
3 ms
Beats
100%
Memory
42 MB
Beats
80.66%
     */
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    int num = i *j;
                    if(num % k == 0){
                        count++;
                    }

                }
            }
        }
        return count;
    }
}
