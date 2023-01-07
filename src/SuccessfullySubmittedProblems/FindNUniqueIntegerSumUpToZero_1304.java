package SuccessfullySubmittedProblems;

public class FindNUniqueIntegerSumUpToZero_1304 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.7 MB
Beats
73.47%
     */
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0;
        if(n % 2 != 0){
            arr[index++] = 0;
            n--;
        }
        int num = 0;
        int toDeal = 1;
        while(n > 0){
            arr[index++] = num + toDeal;
            arr[index++] = num - toDeal;
            toDeal++;
            n -= 2;
        }
        return arr;
    }
}
