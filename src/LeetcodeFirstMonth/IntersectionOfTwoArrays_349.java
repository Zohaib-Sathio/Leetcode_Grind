package LeetcodeFirstMonth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {

//    Runtime: 7 ms, faster than 23.47% of Java online submissions for Intersection of Two Arrays.
//    Memory Usage: 43.7 MB, less than 66.96% of Java online submissions for Intersection of Two Arrays.

    public static int[] intersectionOfArrays(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
                j++;
            }
        }
        int[] returnArray = new int[set.size()];
        int idx = 0;
        for (Integer integer : set) {
            returnArray[idx++] = integer;
        }
        return returnArray;
    }


    // O(n) time complexity

    //Because set has O(1) time complexity for add, contains and remove operations
//    public class Solution {
//        public int[] intersection(int[] nums1, int[] nums2) {
//            Set<Integer> set = new HashSet<>();
//            Set<Integer> intersect = new HashSet<>();
//            for (int i = 0; i < nums1.length; i++) {
//                set.add(nums1[i]);
//            }
//            for (int i = 0; i < nums2.length; i++) {
//                if (set.contains(nums2[i])) {
//                    intersect.add(nums2[i]);
//                }
//            }
//            int[] result = new int[intersect.size()];
//            int i = 0;
//            for (Integer num : intersect) {
//                result[i++] = num;
//            }
//            return result;
//        }
//    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5, 3, 8};
        int[] nums2 = {9, 4, 9, 8, 4};
//        int[] array = intersectionOfArrays(nums1, nums2);
        System.out.println(Arrays.toString(intersectionOfArrays(nums1, nums2)));

    }
}
