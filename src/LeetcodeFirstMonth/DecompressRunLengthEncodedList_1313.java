package LeetcodeFirstMonth;

import java.util.LinkedList;
import java.util.List;

public class DecompressRunLengthEncodedList_1313 {
    /*
    Runtime: 56 ms, faster than 5.44% of Java online submissions for Decompress Run-Length Encoded List.
Memory Usage: 49.4 MB, less than 7.70% of Java online submissions for Decompress Run-Length Encoded List.
     */
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new LinkedList();
        int freqNum = 0, valNum = 1;
        while(freqNum != nums.length){
            int freq = nums[freqNum];
            int val = nums[valNum];
            while(freq > 0){
                list.add(val);
                freq--;
            }
            freqNum += 2;
            valNum += 2;
        }
        int[] decompressed = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            decompressed[i] = list.get(i);
        }
        return decompressed;
    }
    public static void main(String[] args) {

    }
}
