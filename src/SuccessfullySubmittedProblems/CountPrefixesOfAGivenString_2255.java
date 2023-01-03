package SuccessfullySubmittedProblems;

public class CountPrefixesOfAGivenString_2255 {
    /*
    Runtime
1 ms
Beats
89.59%
Memory
42.4 MB
Beats
73.57%
     */
    public int countPrefixes(String[] words, String s) {
        int prefix = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if( i == s.length()){
                    break;
                }
                if(word.charAt(i) != s.charAt(i)){
                    break;
                }
                if(i == word.length()-1){
                    prefix++;
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(1%2);
    }
}
