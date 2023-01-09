package SuccessfullySubmittedProblems;

public class FindTheOriginalArrayOfPrefixXOR_2433 {
    /*
    Runtime
2 ms
Beats
87.50%
Memory
55.4 MB
Beats
69.77%
     */
    // public int[] findArray(int[] pref) {
    //     int[] arr = new int[pref.length];
    //     int first = 0;
    //     int index = 0;
    //     for(int num : pref){
    //         arr[index] = first ^ num;
    //         first  = first ^ arr[index++];
    //     }
    //     return arr;
    // }
    public int[] findArray(int[] pref) {
        int first = 0;
        for(int i = 0; i < pref.length; i++){
            pref[i] = first ^ pref[i];
            first ^= pref[i];
        }
        return pref;
    }
}
