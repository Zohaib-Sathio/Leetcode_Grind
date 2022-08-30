package SuccessfullySubmittedProblems;

import java.util.HashSet;

public class RemoveElementsFromSortedArray_26 {
    /*
    Runtime: 4 ms, faster than 12.68% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 48.3 MB, less than 11.00% of Java online submissions for Remove Duplicates from Sorted Array.
     */
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int k = 0;
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            k++;
            set.add(nums[i]);
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx++] = temp;

        }
        return k;
    }
    public static void main(String[] args) {

    }
}
