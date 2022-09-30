package Resubmitted_Problems;

public class BuildArrayFromPermutation_1920 {
    /*
    Runtime: 2 ms, faster than 60.80% of Java online submissions for Build Array from Permutation.
Memory Usage: 53.7 MB, less than 54.38% of Java online submissions for Build Array from Permutation.
     */
    public int[] buildArray(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[nums[i]];
        }
        return newArr;

    } }
