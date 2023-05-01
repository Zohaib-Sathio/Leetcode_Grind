package Top_Interview_Questions_Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class TopKFrequentElements_347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        // 1 1 1 2 2 3
        // 3 3 3 2 2 1
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // 3 3 3 2 2 1
        // 1 1 1 2 2 3
        HashMap<Integer, Integer> map2 = new HashMap();
        for(int i = 0; i < nums.length; i++){
            map2.put(map.getOrDefault(nums[i], 0), nums[i]);
        }

        int[] ans = new int[k];
        int index = 0;
        HashSet<Integer> set = new HashSet();

        // 1 1 1 2 2 3 5 5 5 7 2

        // 3 3 3 3 3 1 3 3 3 1 3

        // 1 1 1 2 2 3 5 5 5 7 2

        for(int i = nums.length; i>=0; i--){
            int num = map2.getOrDefault(i, 0);
            if(num != 0){
                ans[index++] = num;
                // set.add(nums[i]);
                k--;
            }
            if(k == 0) break;

        }
        return ans;
    }
}
