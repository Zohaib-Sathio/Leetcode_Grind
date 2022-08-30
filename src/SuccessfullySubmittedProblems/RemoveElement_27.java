package SuccessfullySubmittedProblems;

public class RemoveElement_27 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
Memory Usage: 40.8 MB, less than 92.97% of Java online submissions for Remove Element.
     */
    public int removeElement(int[] nums, int val) {
        int k = nums.length - 1;
        for(int i = nums.length -1; i >= 0 ; i--){
            if(nums[i] == val){
                int temp = nums[k];
                nums[k--] = nums[i];
                nums[i] = temp;
            }
        }
        return k+1;
    }
    public static void main(String[] args) {

    }
}
