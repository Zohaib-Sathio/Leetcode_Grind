package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    /*
    Runtime
3 ms
Beats
71.19%
Memory
42.9 MB
Beats
62.21%
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        sumOfCombo(0, candidates, list, 0, target, ans);
        return ans;
    }
    public static void sumOfCombo(int index, int[] candidates,List<Integer> list, int sum, int target, List<List<Integer>> returnList){
        if(sum > target) return;
        if(index == candidates.length){
            if(sum == target){
                returnList.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(candidates[index]);
        sum += candidates[index];
        sumOfCombo(index, candidates, list, sum, target, returnList);

        list.remove(list.size() -1);
        sum -= candidates[index];
        sumOfCombo(index+1, candidates, list, sum, target, returnList);
    }
}
