package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    /*
    Runtime
1 ms
Beats
94.31%
Memory
42.3 MB
Beats
90.46%
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPerm(0, nums, ans);
        return ans;
    }
    private static void findPerm(int index, int[] nums, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int j : nums){
                list.add(j);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(index, i, nums);
            findPerm(index+1, nums, ans);
            swap(index, i, nums);
        }
    }
    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
