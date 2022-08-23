package LeetcodeFirstMonth;

import java.util.Arrays;

//My first solution
//Have used merge sort but need another solution with O(m+n) time complexity
public class MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < nums2.length; i++) {
            nums1[n++] = nums2[i];
        }
        int sIdx = 0, eIdx = nums1.length -1;
        divide(nums1, sIdx, eIdx);
//        for (int i = 0; i < m; i++) {
//            if(nums1[eIdx] <= nums1[sIdx]){
//                int temp = nums1[sIdx];
//                nums1[sIdx] = nums1[eIdx];
//                nums1[eIdx--] = temp;
//            }
//            else {
//                sIdx++;
//            }
//        }
    }
    public static void divide(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int middle = low + (high - low)/2;
        divide(nums, low, middle);
        divide(nums, middle+1, high);
        conquer(nums, low, middle, high);
    }
    public static void conquer(int[] nums, int low, int middle, int high){
        int[] merged = new int[high - low + 1];
        int index = 0;
        int idx1 = low;
        int idx2 = middle + 1;
        while (idx1 <= middle && idx2 <= high){
            if(nums[idx1] <= nums[idx2]){
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
        for (int i = 0,j = low; i < merged.length; i++, j++) {
            nums[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {0};
        int[] nums2 = {1};
        combine(nums, 0, nums2, 1);
        System.out.println(Arrays.toString(nums));
    }

    /*
    Runtime: 1 ms, faster than 36.15% of Java online submissions for Merge Sorted Array.
Memory Usage: 42.7 MB, less than 56.85% of Java online submissions for Merge Sorted Array.
     */
//Optimal Solution for this problem from leetcode

    // 1ms
public static void combine(int[] nums1, int m, int[] nums2, int n){
    int tail1 = m - 1, tail2 = n - 1, index = m + n - 1;
    while (tail1 >= 0 && tail2 >= 0){
        nums1[index--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
    }
    while (tail2 >= 0){
        nums1[index--] = nums2[tail2--];
    }
} }
