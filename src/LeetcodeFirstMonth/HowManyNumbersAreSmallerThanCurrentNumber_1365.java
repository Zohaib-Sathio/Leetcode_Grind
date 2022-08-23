package LeetcodeFirstMonth;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber_1365 {
    //First n*n solution complexity
    /*
    Runtime: 15 ms, faster than 64.96% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
Memory Usage: 44.6 MB, less than 55.75% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
     */

    //Second solution first sort array then compare
    /*
    Runtime: 7 ms, faster than 76.80% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
Memory Usage: 44.7 MB, less than 47.25% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
     */

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int index = 0;
        for(int num : nums){
            int count = 0;
            for(int nextNum : sorted){
                if(nextNum >= num){
                    break;
                }
                count++;
            }
            ans[index++] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}
