package LeetcodeFirstMonth;

public class ConcetationOfArrays_1929 {
    /*
    Runtime: 1 ms, faster than 98.83% of Java online submissions for Concatenation of Array.
Memory Usage: 42.7 MB, less than 93.64% of Java online submissions for Concatenation of Array.
     */

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int index = 0;
        for(int i = 0; i < ans.length; i++){
            if(index == nums.length)
                index = 0;
            ans[i] = nums[index++];
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
