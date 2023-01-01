package SuccessfullySubmittedProblems;

import java.util.HashSet;

public class CountNumberofDistinctIntegersAfterReverseOperations_2442 {
    /*
    Runtime
75 ms
Beats
89.39%
Memory
61.8 MB
Beats
90.43%
     */
    public int countDistinctIntegers(int[] nums) {
        int count = 0;
        HashSet<Integer> map = new HashSet<>();
        for(int num: nums){
            if(!map.contains(num)){
                count++;
                map.add(num);
            }
            int reverse = 0;
            while(num > 0){
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num/10;
            }
            if(!map.contains(reverse)){
                count++;
                map.add(reverse);
            }
        }
        return count;
    }
}
