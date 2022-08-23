package LeetcodeFirstMonth;

import java.util.Arrays;
//Not working on all test cases

//Second time, I have used merge sort it's working but I need to look up for more
//optimal solution!
public class SortColors_75 {
//    public static void sortColors(int[] nums){
//        int sIdx = 0, eIdx = nums.length-1;
//        divide(nums, sIdx, eIdx);
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[eIdx] <= nums[sIdx]){
//                int temp = nums[eIdx];
//                nums[eIdx--] = nums[sIdx];
//                nums[sIdx] = temp;
//            }
//            else {
//                sIdx++;
//            }
//        }
//    }
//    public static void divide(int[] nums, int low, int high){
//        if(low >= high){
//            return;
//        }
//        int middle = low + (high - low)/2;
//        divide(nums, low, middle);
//        divide(nums, middle+1, high);
//        conquer(nums, low, middle, high);
//    }
//    public static void conquer(int[] nums, int low, int middle, int high){
//        int[] merged = new int[high - low + 1];
//        int index = 0, idx1 = low, idx2 = middle + 1;
//        while (idx1 <= middle && idx2 <= high){
//            if(nums[idx1] <= nums[idx2]){
//                merged[index++] = nums[idx1++];
//            }
//            else {
//                merged[index++] = nums[idx2++];
//            }
//        }
//        while (idx1 <= middle){
//            merged[index++] = nums[idx1++];
//        }
//        while (idx2 <= high){
//            merged[index++] = nums[idx2++];
//        }
//        for (int i = 0, j = low; i < merged.length; i++, j++) {
//            nums[j] = merged[i];
//        }
//    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
//      int[] nums = {0,0,2,1,1,2};
//      int[] nums = {0,X,2,1,X,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Optimal Solution for this problem from leetcode

    //0 ms
    public static void sortColors(int[] nums){
        int index = 0, sIdx = 0, eIdx = nums.length - 1;
        while (index <= eIdx){
            if(nums[index] == 0){
                int temp = nums[index];
                nums[index] = nums[sIdx];
                nums[sIdx++] = temp;
            }
            if(nums[index] == 2){
                int temp = nums[index];
                nums[index] = nums[eIdx];
                nums[eIdx--] = temp;
                index--;
            }
            index++;
        }

    }
}
