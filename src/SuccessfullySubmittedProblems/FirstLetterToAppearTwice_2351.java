package SuccessfullySubmittedProblems;

import java.util.HashSet;
import java.util.Set;

/*
Runtime
0 ms
Beats
100%
Memory
40.5 MB
Beats
80.62%
 */
public class FirstLetterToAppearTwice_2351 {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet();

        for(int j = 0; j < s.length(); j++){
            if(set.contains(s.charAt(j))){
                return s.charAt(j);
            }
            set.add(s.charAt(j));
        }
        return 'a';
    }

//    public static void main(String[] args) {
//        char a = 'a';
//        int b = a;
//        System.out.println(b-97);
//    }
}
