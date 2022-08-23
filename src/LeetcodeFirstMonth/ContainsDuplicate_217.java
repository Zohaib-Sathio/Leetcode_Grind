package LeetcodeFirstMonth;

import java.util.HashSet;
import java.util.Set;

/*
Runtime: 6 ms, faster than 96.83% of Java online submissions for Contains Duplicate.
Memory Usage: 54.7 MB, less than 92.71% of Java online submissions for Contains Duplicate.
 */
public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,23,5,3};
        System.out.println(containsDuplicate(nums));
    }
}
