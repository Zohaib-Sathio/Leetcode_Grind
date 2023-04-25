package Top_Interview_Questions_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Permutations_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new LinkedList();
        List<Integer> list = new LinkedList();
        perm(answer, nums, list);
        return answer;
    }
    public void perm(List<List<Integer>> answer, int[] nums,List<Integer> list){
        if(list.size() == nums.length){
            answer.add(new LinkedList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            perm(answer, nums, list);
            list.remove(list.size() -1);
        }
    }
}
