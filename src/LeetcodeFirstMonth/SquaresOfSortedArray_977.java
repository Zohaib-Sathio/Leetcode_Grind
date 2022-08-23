package LeetcodeFirstMonth;

import java.util.Arrays;

public class SquaresOfSortedArray_977 {
    /*
    Runtime: 2 ms, faster than 85.31% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 55.4 MB, less than 63.06% of Java online submissions for Squares of a Sorted Array.
     */
    public static int[] squaresOfSortedArray(int[] nums){
        int idx1 = 0, idx2 = nums.length - 1, index = nums.length - 1;
        int[] squaredArray = new int[nums.length];
        while (idx1 <= idx2){
            int firstSquare = nums[idx1] * nums[idx1];
            int secondSquare = nums[idx2] * nums[idx2];
            if(firstSquare > secondSquare){
                squaredArray[index--] = firstSquare;
                idx1++;
            }
            else {
                squaredArray[index--] = secondSquare;
                idx2--;
            }
        }
        return squaredArray;
    }
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(squaresOfSortedArray(nums)));
    }
}
