package LeetcodeFirstMonth;

public class BuildArrayFromPermutation_1920 {

    /*
    Runtime: 1 ms, faster than 99.95% of Java online submissions for Build Array from Permutation.
Memory Usage: 53.9 MB, less than 35.39% of Java online submissions for Build Array from Permutation.
     */
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
