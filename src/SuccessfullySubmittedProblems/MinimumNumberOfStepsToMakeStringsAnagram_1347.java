package SuccessfullySubmittedProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MinimumNumberOfStepsToMakeStringsAnagram_1347 {
    /*
    Runtime
86 ms
Beats
20.3%
Memory
42.8 MB
Beats
87.85%
     */
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int steps = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) > 0 ){
                    map.put(s.charAt(i), map.get(s.charAt(i)) -1);
                }
                else{
                    steps++;
                }
            }
            else{
                steps++;
            }
        }
        return steps;
    }

}
