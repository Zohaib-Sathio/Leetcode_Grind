package BiWeeklyContest;

public class maximum_sum_with_exactly_k_elements {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int sum = 0;
        while(k > 0){
            sum += max;
            max++;
            k--;
        }
        return sum;
    }
}
