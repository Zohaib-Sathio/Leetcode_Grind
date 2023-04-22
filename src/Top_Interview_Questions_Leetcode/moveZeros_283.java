package Top_Interview_Questions_Leetcode;

public class moveZeros_283 {
    // More optimal code
    public void moveZeroes2(int[] nums) {
        int nonZeros = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nonZeros++;
        }
        int index = 0;
        int i = 0;
        while(index != nums.length){
            if(index >= nonZeros){
                nums[index++] = 0;
            }
            else{
                if(nums[i] != 0){
                    nums[index++] = nums[i];
                }
            }
            i++;
        }
    }

    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] == 0){
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }
}
