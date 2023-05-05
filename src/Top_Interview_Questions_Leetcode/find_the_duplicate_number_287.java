package Top_Interview_Questions_Leetcode;

public class find_the_duplicate_number_287 {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int n : nums){
            if(arr[n]){
                return n;
            }
            arr[n] = true;
        }
        return -1;
    }
}
