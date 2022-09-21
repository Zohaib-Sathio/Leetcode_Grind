package Resubmitted_Problems;

import java.util.HashSet;

public class JewelsAndStones_771 {
    //Previous solution was using two nested for loops but still idk why
    // it was faster than this O(n) solution!!!
    /*
    Runtime: 3 ms, faster than 33.20% of Java online submissions for Jewels and Stones.
Memory Usage: 42.3 MB, less than 52.27% of Java online submissions for Jewels and Stones.
     */
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet();
        for(int i = 0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        int jewelsTotal = 0;
        for(int j = 0 ; j < stones.length(); j++){
            if(set.contains(stones.charAt(j))){
                jewelsTotal++;
            }
        }
        return jewelsTotal;
    }
}
