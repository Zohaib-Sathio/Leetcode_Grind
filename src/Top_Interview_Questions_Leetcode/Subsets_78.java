package Top_Interview_Questions_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new LinkedList();
        ans.add(new LinkedList());
        for(int i = 0; i < nums.length; i++){
            LinkedList<Integer> list = new LinkedList();
            list.add(nums[i]);
            rec(ans, nums, list, i+1);
        }
        return ans;
    }
    public static void rec(List<List<Integer>> ans, int[] nums, List<Integer> list, int index){
        ans.add(new LinkedList(list));
        if(index == nums.length){
            return;
        }
        for(int i = index; i < nums.length; i++){
            list.add(nums[i]);
            rec(ans, nums, list, i+1);
            list.remove(list.size() - 1);
        }
    }
}
