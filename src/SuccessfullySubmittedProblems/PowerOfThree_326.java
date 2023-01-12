package SuccessfullySubmittedProblems;

public class PowerOfThree_326 {

    /*
    Runtime
15 ms
Beats
94.36%
Memory
41.8 MB
Beats
89.86%
     */
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        while(n >= 3){
            if(n == 3){
                return true;
            }
            if(n % 3 != 0){
                return false;
            }
            n = n / 3;
        }
        return false;
    }

    //Recursive Solution
    /*
    Runtime
15 ms
Beats
94.36%
Memory
42.5 MB
Beats
60.50%
     */
    public boolean isPowerOfThree2(int n) {

        if(n == 1 || n == 3){
            return true;
        }
        if(n < 3){
            return false;
        }
        if(n % 3 != 0){
            return false;
        }
        return isPowerOfThree2(n/3);
    }

    //A new solution without using loops or recursion! Amazinggg
    public boolean isPowerOfThree3(int n) {
        if(n <= 0){
            return false;
        }
        return 1162261467 % n == 0;
    }
}
