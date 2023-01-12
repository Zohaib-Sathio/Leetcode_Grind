package SuccessfullySubmittedProblems;

public class NumberOfStepsToReduceNumberToZero_1342 {
    /*
    Runtime
1 ms
Beats
58.84%
Memory
40.8 MB
Beats
45.77%
     */
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
            }
            count++;
        }
        return count;
    }
}
