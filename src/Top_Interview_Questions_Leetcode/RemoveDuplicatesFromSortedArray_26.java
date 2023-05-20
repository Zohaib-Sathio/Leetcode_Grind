package Top_Interview_Questions_Leetcode;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray_26 {
    //First Solution

    /*
    Runtime
2 ms
Beats
16.82%
Memory
44.7 MB
Beats
6.80%
     */
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet();
        // for(int i = 0; i< nums.length; i++){
        //    set.add(nums[i]);
        // }
        int[] arr = new int[nums.length];
        HashSet<Integer> set2 = new HashSet();
        int last = nums.length-1;
        int first = 0;
        for(int i = 0; i< nums.length; i++){
            if(set2.contains(nums[i])){
                arr[last--] = nums[i];
            }
            else{
                set2.add(nums[i]);
                arr[first++] = nums[i];
            }
        }
        System.arraycopy(arr, 0, nums, 0, nums.length);
        return set2.size();
    }

    //Second Solution
    /*
    Runtime
1 ms
Beats
99.91%
Memory
43.8 MB
Beats
85.88%
     */
    public int removeDuplicates2(int[] nums) {
        int k = 1;
        for(int i =1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
