package LeetcodeFirstMonth;

import java.util.Arrays;

public class RearrangeArrayElementsBySign_2149 {

    //This solution has O(n) time complexity but also O(n) space complexity
    public static int[] rearrangeElements(int[] nums){
        int[] newNums = new int[nums.length];
        int positiveIdx = 0, negativeIdx = 1;
        for(int number : nums){
            if(number > 0){
                newNums[positiveIdx] = number;
                positiveIdx += 2;
            }
            else {
                newNums[negativeIdx] = number;
                negativeIdx += 2;
            }
        }
        return newNums;
    }

    /*
    Runtime: 9 ms, faster than 47.54% of Java online submissions for Rearrange Array Elements by Sign.
Memory Usage: 211.1 MB, less than 71.93% of Java online submissions for Rearrange Array Elements by Sign.
     */
    public static int[] rearrangeElementsApproach2(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int positive=0, negative=1;

        for(int i=0; i<n; i++){
            if(nums[i]>0){
                res[positive]=nums[i];
                positive += 2;
            }
            else{
                res[negative]=nums[i];
                negative += 2;
            }
        }

        return res;
    }

    public static int[] rearrangeElementsApproach3(int[] nums){
        // 3 1 -2 -5 2 -4
        // 3 -2 1 -5 2 -4
        int exchanger = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                if(nums[i] < 0){
                    int temp = nums[i];
                    nums[i] = nums[i+exchanger];
                    nums[i+exchanger] = temp;
                    i--;
                    exchanger++;
                }
                else {
                    exchanger = 1;
                }
            }
            else {
                if(nums[i] > 0){
                    int temp = nums[i];
                    nums[i] = nums[i+exchanger];
                    nums[i+exchanger] = temp;
                    i--;
                    exchanger++;
                }
                else {
                    exchanger = 1;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        /*
        Wrong Answer
Runtime: 0 ms
Your input
  [3,1,-2,-5,2,-4]
   3 -2 1 -5 2 -4
Output
[3,-4,1,-5,2,-2]
Expected
[3,-2,1,-5,2,-4]
         */
        int[] nums = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
//        int[] nums = {-1, 1};
//        int[] nums = {};
        System.out.println(Arrays.toString(rearrangeElementsApproach2(nums)));
    }
}
