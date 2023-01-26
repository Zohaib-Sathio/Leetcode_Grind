package SuccessfullySubmittedProblems;

public class XOROperationInAnArray_1486 {
    /*
    Runtime
0 ms
Beats
100%
Memory
39.3 MB
Beats
68.46%
     */
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = start + 2 * i;
        }
        int XOR = 0;
        for(int num : nums){
            XOR = XOR ^ num;
        }
        return XOR;
    }
//    public int xorOperation(int n, int start) {
//        int XOR = 0;
//        for(int i = 0; i < n; i++){
//            XOR = XOR ^ (start + 2 * i);
//        }
//        return XOR;
//    }
}
