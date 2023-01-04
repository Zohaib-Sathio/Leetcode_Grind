package SuccessfullySubmittedProblems;

public class DecodeXORedArray_1720 {
    /*
    Runtime
1 ms
Beats
100%
Memory
43.7 MB
Beats
95.65%
     */
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        int index = 0;
        arr[index++] = first;
        for(int num : encoded){
            arr[index] = first ^ num;
            first = arr[index++];
        }
        return arr;
    }
}
