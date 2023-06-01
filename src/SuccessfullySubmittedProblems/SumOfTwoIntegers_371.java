package SuccessfullySubmittedProblems;

public class SumOfTwoIntegers_371 {
    /*
    Runtime
0 ms
Beats
100%
Memory
39.5 MB
Beats
57.90%
     */
    public int getSum(int a, int b) {
        if(a <= 0 && b <= 0){
            for(int i = 0; i > b; i--) a--;
        }
        else if(a <= 0 && b >= 0){
            for(int i = 0; i < b; i++) a++;
        }
        else if(a >= 0 && b <= 0){
            for(int i = 0; i > b; i--) a--;
        }
        else{
            for(int i = 0; i < b; i++) a++;
        }

        return a;
    }
}
