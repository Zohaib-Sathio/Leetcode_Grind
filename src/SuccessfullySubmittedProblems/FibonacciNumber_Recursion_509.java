package SuccessfullySubmittedProblems;

public class FibonacciNumber_Recursion_509 {
    /*
    Runtime
0 ms
Beats
100%
Memory
39 MB
Beats
85.90%
     */
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        return findFib(0, 1, n);
    }
    public static int findFib(int a, int b, int n){
        if(n < 3){
            return a+b;
        }
        return findFib(b, a+b, n-1);
    }
}
