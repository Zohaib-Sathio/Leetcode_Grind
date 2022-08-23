package LeetcodeFirstMonth;

import java.util.Arrays;

public class MajorityElement_169 {

//    Runtime: 7 ms, faster than 41.03% of Java online submissions for Majority Element.
//    Memory Usage: 55.7 MB, less than 61.89% of Java online submissions for Majority Element.

    //Total time complexity O(nlogn)
    public static int majorityElement(int[] nums){

        //O(nlogn)
        Arrays.sort(nums);
        int repeatition = 1;

        //O(n)
        for (int i = 0, j = 1; i < nums.length - 1; i++, j++) {
            if(nums[i] == nums[j]){
                repeatition++;
            }
            else{
                repeatition = 1;
            }
            if(repeatition > nums.length/2){
                return nums[j];
            }
        }
        return nums[0];


        // A bit tricky to develop such algorithm by oneself.
        // Leetcode solution O(n) time complexity
//        int major=num[0], count = 1;
//        for(int i=1; i<num.length;i++){
//            if(count==0){
//                count++;
//                major=num[i];
//            }else if(major==num[i]){
//                count++;
//            }else count--;
//
//        }
//        return major;



        //Honourable MENTION ;)
        // Looked interesting
//        Arrays.sort(nums);
//        int len = nums.length;
//        return nums[len/2];
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,3,3, 2, 2,3, 3};
        System.out.println(majorityElement(nums));
    }


    //Could not find any accurate solution, fails in different test cases!!!
    //    public static int majorityElement(int[] nums){
//        int longestRepeated = 0;
//        int repeated = 1;
//        int elementToReturn = -111;
//        int tempMajorElement;
//        // r -> 1   mE-> 3     l -> 2    rE -> 1
//        //1 1 3i 2j 1 1 3
//        for (int i = 0, j = 1; i < nums.length - 1; i++, j++) {
//            if(nums[i] == nums[j]){
//                repeated++;
//                tempMajorElement = nums[i];
//            }
//            else {
//                if(nums[j] == elementToReturn){
//                    int temp = longestRepeated + 1;
//                    longestRepeated = repeated;
//                    tempMajorElement = nums[j];
//                    repeated = temp;
//                }
//                else{
//                    elementToReturn = nums[i];
//                    longestRepeated = repeated;
//                    repeated = 1;
//                    tempMajorElement = nums[j];
//                }
//            }
//            if(repeated > nums.length/2){
//                return tempMajorElement;
//            }
//        }
//
//        return -1;
//    }
}
