package BiWeeklyContest;


import java.util.Arrays;

public class MaximumStrengthOfGroup {

    public long maxStrength(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int negNums = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0) break;
            negNums++;
        }
        long strength = 1;
        boolean flag = true;
        int rem = negNums%2;
        for(int i = nums.length-1; i >= 0; i--){
            if(rem == 1){
                if(nums[i] < 0){
                    rem = 0;
                    continue;
                }
            }
            if(nums[i] != 0){
                strength *= nums[i];
                flag = false;
            }
        }
        if(strength == 1 && flag) return 0;
        return strength;
    }

}
