package LeetcodeFirstMonth;

import java.util.Arrays;

public class SortArrayByParityII_922 {
    /*
    Runtime: 16 ms, faster than 6.32% of Java online submissions for Sort Array By Parity II.
Memory Usage: 45.1 MB, less than 84.99% of Java online submissions for Sort Array By Parity II.
     */
    public static int[] sortArray(int[] nums){

        // 2, 4, 6, 8, 1, 3, 5, 7
        // 2  1  4  6  8  3 5 7
        //

        int exchanger = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                if(nums[i] % 2 != 0){
                    int temp = nums[i];
                    nums[i] = nums[i+exchanger];
                    nums[i+exchanger] = temp;
                    i--;
                    exchanger++;
                }
                else {
                    exchanger = 1;
                }
            }
            else {
                if(nums[i] % 2 == 0){
                    int temp = nums[i];
                    nums[i] = nums[i+exchanger];
                    nums[i+exchanger] = temp;
                    i--;
                    exchanger++;
                }
                else {
                    exchanger = 1;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        //Not working on this input
        // Fixed by checking if first element is even or odd!
//        int[] nums = {3, 4};


        // Not working on this input
        int[] nums = {4,1,2,1};

//        int[] nums = {2, 4, 6, 8, 1, 3, 5, 7};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
