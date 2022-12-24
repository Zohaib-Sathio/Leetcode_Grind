package SuccessfullySubmittedProblems;

import java.util.HashSet;
import java.util.Set;

public class CheckIfSentenceIsPangram_1832 {
/*
Runtime
6 ms
Beats
45.20%
Memory
42.8 MB
Beats
6.56%
 */

    public boolean checkIfPangram(String sentence) {
        Set<Character> alphabets = new HashSet();
        String english = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < english.length(); i++){
            alphabets.add(english.charAt(i));
        }
        int counter = 0;
        for(int j = 0; j < sentence.length(); j++){
            if(alphabets.contains(sentence.charAt(j))){
                counter++;
                alphabets.remove(sentence.charAt(j));
            }
        }
        if(counter == 26){
            return true;
        }
        else{
            return false;
        }
    }
}
