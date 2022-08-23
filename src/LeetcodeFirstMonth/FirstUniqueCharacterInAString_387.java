package LeetcodeFirstMonth;

import java.util.HashMap;

public class FirstUniqueCharacterInAString_387 {

    //2 Solutions!

    /*
    Runtime: 68 ms, faster than 15.08% of Java online submissions for First Unique Character in a String.
Memory Usage: 54.7 MB, less than 9.34% of Java online submissions for First Unique Character in a String.
     */

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char Character = s.charAt(i);
            if(map.containsKey(Character)){
                map.put(Character, map.get(Character) + 1);
            }
            else {
                map.put(Character, 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    /*
    Runtime: 11 ms, faster than 79.83% of Java online submissions for First Unique Character in a String.
Memory Usage: 48.3 MB, less than 76.34% of Java online submissions for First Unique Character in a String.
     */
    public int firstUniqChar2(String s) {
        int[] charArray = new int[26];
        for(int i = 0; i < s.length(); i++){
            charArray[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < s.length(); j++){
            if(charArray[s.charAt(j) - 'a'] == 1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
