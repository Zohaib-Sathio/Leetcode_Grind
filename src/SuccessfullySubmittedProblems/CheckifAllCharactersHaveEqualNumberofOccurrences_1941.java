package SuccessfullySubmittedProblems;

import java.util.HashMap;
import java.util.HashSet;

public class CheckifAllCharactersHaveEqualNumberofOccurrences_1941 {
    /*
    Runtime
7 ms
Beats
58.33%
Memory
42.6 MB
Beats
36.67%
     */
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap();
        HashSet<Character> set = new HashSet();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        int occurrence = s.length() / set.size();
        for (Character character : set) {
            // System.out.println(map.get(character));
            if (map.get(character) != occurrence) {
                return false;
            }
        }
        return true;
    }
}
