package LeetcodeFirstMonth;

import java.util.Arrays;

public class DIStringMatch_942 {

//    Runtime: 6 ms, faster than 12.51% of Java online submissions for DI String Match.
//    Memory Usage: 47.7 MB, less than 80.45% of Java online submissions for DI String Match.

    public static int[] diStringMatch(String s){
        int[] output = new int[s.length() + 1];
        int idx1 = 0, idx2 = s.length();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I'){
                output[i] = idx1++;
            }
            else {
                output[i] = idx2--;
            }
        }
        output[s.length()] = idx1;
        return output;
    }
    public static void main(String[] args) {
        String s = "DDI";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }
}
