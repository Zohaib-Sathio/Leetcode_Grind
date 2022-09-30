package Resubmitted_Problems;

public class ConcetationOfArray_1929 {
    /*
    Runtime: 3 ms, faster than 22.60% of Java online submissions for Concatenation of Array.
Memory Usage: 50 MB, less than 58.46% of Java online submissions for Concatenation of Array.
     */
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int length = nums.length;
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
            arr[length++] = nums[i];
        }
        return arr;
    }
}
