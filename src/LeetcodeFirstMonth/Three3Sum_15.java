package LeetcodeFirstMonth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Not getting any exact solution

//Got first feasible solution with O(n*m) time complexity
// Still failing one test case


//Success Details
//        Runtime: 31 ms, faster than 64.28% of Java online submissions for 3Sum.
//        Memory Usage: 61.1 MB, less than 27.51% of Java online submissions for 3Sum

// I had one bug: Duplicate triplets were also being added so had to look for it in solutions.
public class Three3Sum_15 {
    public static List<List<Integer>> threeSum(int[] nums){
        int low = 0, high = nums.length -1;
        sortList(nums, low, high);
        //0 0 0 0
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i <= high; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
            int j = i + 1, k = high;
            int sumToCheck = -nums[i];
            while (j < k){
                int sum = nums[j] + nums[k];
                if(sum < sumToCheck){
                    j++;
                }
                else if( sum == sumToCheck){
                        List<Integer> list2 = new ArrayList<>();
                        list2.add(nums[i]);
                        list2.add(nums[j]);
                        list2.add(nums[k]);
                        list1.add(list2);
                        k--; j++;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                }
                else {
                    k--;
                }
            } }
        }


        return list1;
    }
    private static void sortList(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int middle = low + (high - low) / 2;
        sortList(nums, low, middle);
        sortList(nums, middle + 1, high);
        merge(nums, low, middle, high);
    }
    private static void merge(int[] nums, int low, int middle, int high){
        int[] merged = new int[high - low + 1];
        int index = 0;
        int idx1 = low;
        int idx2 = middle + 1;
        while (idx1 <= middle && idx2 <= high){
            if(nums[idx1] < nums[idx2]){
                merged[index++] = nums[idx1++];
            }
            else {
                merged[index++] = nums[idx2++];
            }
        }
        while (idx1 <= middle){
            merged[index++] = nums[idx1++];
        }
        while (idx2 <= high){
            merged[index++] = nums[idx2++];
        }
        for (int i = 0, j = low; i < merged.length; i++,j++) {
            nums[j] = merged[i];
        }
    }


    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
//                -1,0,1,2,-1,-4
                    //
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
}
