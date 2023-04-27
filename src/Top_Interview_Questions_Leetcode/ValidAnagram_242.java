package Top_Interview_Questions_Leetcode;

import java.util.Arrays;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        //O(1)
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        s = String.valueOf(sArr);
        t = String.valueOf(tArr);

        return (s.equals(t));
    }
    // linear solution
    public boolean isAnagram2(String s, String t) {
        //O(1)
        if(s.length() != t.length()) return false;

        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a'] -= 1;
        for(int i: alphabet) if(i != 0) return false;
        return true;
    }
}
