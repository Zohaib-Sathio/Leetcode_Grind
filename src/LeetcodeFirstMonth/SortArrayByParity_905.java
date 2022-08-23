package LeetcodeFirstMonth;

import java.util.Arrays;

public class SortArrayByParity_905 {
    /*
    Runtime: 2 ms, faster than 47.93% of Java online submissions for Sort Array By Parity.
Memory Usage: 47.6 MB, less than 81.84% of Java online submissions for Sort Array By Parity.
     */
    public static int[] sortArrayByParity(int[] nums){
        int idx1 = 0, idx2 = nums.length - 1;
        while (idx1 < idx2){
            if(nums[idx1]%2 != 0){
                int temp = nums[idx2];
                nums[idx2--] = nums[idx1];
                nums[idx1] = temp;
            }
            else {
                idx1++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4};
//        int[] nums = {1, 0, 3};
//        int[] nums = {0};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
