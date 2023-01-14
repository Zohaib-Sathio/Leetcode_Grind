package SuccessfullySubmittedProblems;

public class PercentageOfLetterInString_2278 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.1 MB
Beats
93.3%
     */
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        return (count*100) / s.length();
    }
}
