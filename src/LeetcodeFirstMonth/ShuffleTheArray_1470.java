package LeetcodeFirstMonth;

public class ShuffleTheArray_1470 {
    /*
    Runtime: 1 ms, faster than 63.12% of Java online submissions for Shuffle the Array.
Memory Usage: 45.8 MB, less than 43.76% of Java online submissions for Shuffle the Array.
     */
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        int m = 0;
        while(index != nums.length){
                ans[index++] = nums[m++];
                ans[index++] = nums[n++];
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
