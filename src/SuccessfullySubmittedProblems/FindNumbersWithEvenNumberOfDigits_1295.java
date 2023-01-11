package SuccessfullySubmittedProblems;

public class FindNumbersWithEvenNumberOfDigits_1295 {
    /*
    Runtime
117 ms
Beats
6.39%
Memory
42.2 MB
Beats
70.48%
     */
    public int findNumbers(int[] nums) {
        int evenNo = 0;
        for(int num : nums){
            int count = 0;
            while(num > 0){
                count++;
                num = num/10;
            }
            if(count % 2 == 0){
                evenNo++;
            }
        }
        return evenNo;
    }

    //Second Solution with Math involved
    /*
    Runtime
1 ms
Beats
99.66%
Memory
41.5 MB
Beats
96.31%
     */
    public int findNumbers2(int[] nums) {
        int evenNo = 0;
        for(int num : nums){
            int count = (int) (Math.log10(num) + 1);
            if(count % 2 == 0){
                evenNo++;
            }
        }
        return evenNo;
    }
}
