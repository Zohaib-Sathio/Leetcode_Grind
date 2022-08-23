package LeetcodeFirstMonth;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII_350 {

    /*
    Runtime: 7 ms, faster than 25.28% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 44.9 MB, less than 5.46% of Java online submissions for Intersection of Two Arrays II.
     */
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList();
            for(int num : nums1){
                if(map.containsKey(num)){
                    map.put(num, map.get(num) + 1);
                }
                else {
                    map.put(num, 1);
                }
            }
            for(int num : nums2){
                if(map.containsKey(num) && map.get(num) > 0){
                    list.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }
            int index = 0;
            int[] returnArray = new int[list.size()];
            for(int i = 0; i < list.size() ; i++){
                returnArray[index] = list.get(index++);
            }
            return returnArray;
        }
    public static void main(String[] args) {

    }
}
