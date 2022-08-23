package LeetcodeFirstMonth;

public class JewelsAndStones_771 {

//    Runtime: 1 ms, faster than 97.67% of Java online submissions for Jewels and Stones.
//    Memory Usage: 40.6 MB, less than 90.61% of Java online submissions for Jewels and Stones.

    public static int findJewels(String jewels, String stones){
        int foundJewels = 0;
        //O(j*s) time complexity
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if(stones.charAt(i) == jewels.charAt(j)){
                    foundJewels++;
                }
            }
        }
        return foundJewels;
    }
    
    public static void main(String[] args) {
        String jewels = "Aa", stones = "aAAAbbb";
        System.out.println(findJewels(jewels, stones));
    }
}
