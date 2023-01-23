package SuccessfullySubmittedProblems;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords_804 {
    /*
    Runtime
3 ms
Beats
78.99%
Memory
40.3 MB
Beats
87.22%
     */
    public int uniqueMorseRepresentations(String[] words) {
        //declare morse array
        //iterate over words array
        //make morse string and replace it at current index of words array
        String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < words.length; i++){
            String newString = "";
            String word = words[i];
            for(int j = 0; j < word.length(); j++){
                newString += morses[word.charAt(j)-97];
            }
            words[i] = newString;
        }
        Set<String> set = new HashSet();
        for(String word: words){
            set.add(word);
        }
        int count = 0;
        for(String word: words){
            if(set.contains(word)){
                count += 1;
                set.remove(word);
            }
        }
        return count;
    }
}

