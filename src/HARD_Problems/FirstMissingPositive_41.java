package HARD_Problems;

public class FirstMissingPositive_41 {
    /*
    Runtime
1 ms
Beats
100%
Memory
50.1 MB
Beats
98.95%
     */
    public int firstMissingPositive(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0 && nums[i] <= nums.length){
                arr[nums[i]] = true;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(!arr[i+1]){
                return i+1;
            }
        }
        if(arr[nums.length]){
            return nums.length+1;
        }
        return nums.length;
    }
}
