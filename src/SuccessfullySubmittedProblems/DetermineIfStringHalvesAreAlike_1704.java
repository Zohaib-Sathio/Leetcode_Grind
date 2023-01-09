package SuccessfullySubmittedProblems;

import java.util.HashSet;
import java.util.Set;

/*
Runtime
5 ms
Beats
75.11%
Memory
40.5 MB
Beats
90.30%
 */
public class DetermineIfStringHalvesAreAlike_1704 {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet();
        Character[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(Character chare : chars){
            set.add(chare);
        }
        int firstHalf = 0;
        int secondHalf = 0;
        int half = s.length()/2;
        for(int i = 0; i < s.length()/2; i++){
            if(set.contains(s.charAt(i))){
                firstHalf++;
            }
            if(set.contains(s.charAt(half))){
                secondHalf++;
            }
            half++;
        }
        return (firstHalf == secondHalf);
    }
}
