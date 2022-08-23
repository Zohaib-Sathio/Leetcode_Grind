package LeetcodeFirstMonth;

import java.util.Arrays;

public class KthLargestElement_215 {

    //This solution came in my mind instantly!
    //Will look for more optimal solution

//    Runtime: 5 ms, faster than 71.06% of Java online submissions for Kth Largest Element in an Array.
//    Memory Usage: 44.7 MB, less than 51.11% of Java online submissions for Kth Largest Element in an Array.
    public static int kthLargestElement(int[] nums, int k){
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) {
            k--;
            if(k == 0){
                return nums[i];
            }
        }
        throw new IllegalArgumentException("Value of K is greater than array length");
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3, 1,2,4,5,6};
        int k = 3;
        System.out.println(kthLargestElement(nums, k));

    }
}
