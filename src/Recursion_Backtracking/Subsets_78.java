package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    /*
    Runtime
0 ms
Beats
100%
Memory
42.8 MB
Beats
55.26%
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findSubsets(0, nums, list, ans);
        return ans;
    }
    private static void findSubsets(int index, int[] nums, List<Integer> list, List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        findSubsets(index+1, nums, list, ans);
        list.remove(list.size() -1);
        findSubsets(index+1, nums, list, ans);
    }
}
