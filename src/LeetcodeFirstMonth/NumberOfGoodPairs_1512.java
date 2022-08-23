package LeetcodeFirstMonth;

public class NumberOfGoodPairs_1512 {
    /*
    Runtime: 2 ms, faster than 35.32% of Java online submissions for Number of Good Pairs.
Memory Usage: 41.3 MB, less than 72.81% of Java online submissions for Number of Good Pairs.
     */
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int idx1 = 0, idx2 = 1;
        while(idx1 < nums.length - 1){
            if(nums[idx1] == nums[idx2] && idx1 < idx2){
                goodPairs++;
            }
            idx2++;
            if(idx2 == nums.length){
                idx1++;
                idx2 = idx1 + 1;
            }
        }
        return goodPairs;
    }
    public static void main(String[] args) {

    }
}
