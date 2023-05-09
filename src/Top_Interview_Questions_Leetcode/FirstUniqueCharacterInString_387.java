package Top_Interview_Questions_Leetcode;

import java.util.HashMap;

public class FirstUniqueCharacterInString_387 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    //Optimized solution from leetcode
    public int firstUniqChar2(String s) {
        int ans = Integer.MAX_VALUE;
        for(int c = 'a'; c <= 'z'; c++){
            int first = s.indexOf(c);
            if(first != -1 && first == s.lastIndexOf(c)){
                ans = Math.min(ans, first);
            }
        }
        if(ans != Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
}
