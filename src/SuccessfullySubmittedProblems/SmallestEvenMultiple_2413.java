package SuccessfullySubmittedProblems;

public class SmallestEvenMultiple_2413 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Smallest Even Multiple.
Memory Usage: 40.4 MB, less than 82.31% of Java online submissions for Smallest Even Multiple.
     */
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        else{
            return n*2;
        }
    }
}
