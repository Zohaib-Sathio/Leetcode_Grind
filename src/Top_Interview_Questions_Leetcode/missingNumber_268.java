package Top_Interview_Questions_Leetcode;

public class missingNumber_268 {
    public int missingNumber(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int num: nums){
            arr[num] = true;
        }
        for(int i = 0; i < arr.length; i++){
            if(!arr[i]){
                return i;
            }
        }
        return nums.length;
    }
}
