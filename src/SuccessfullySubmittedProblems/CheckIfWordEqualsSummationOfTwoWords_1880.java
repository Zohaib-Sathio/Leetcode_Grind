package SuccessfullySubmittedProblems;

public class CheckIfWordEqualsSummationOfTwoWords_1880 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.2 MB
Beats
93.60%
     */
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = 0;
        int multiple = 1;
        for(int i = firstWord.length()-1; i >= 0; i--){
            num1 += multiple * (firstWord.charAt(i)-97);
            multiple *= 10;
        }
        multiple = 1;
        int num2 = 0;
        for(int i = secondWord.length()-1; i >= 0; i--){
            num2 += multiple * (secondWord.charAt(i)-97);
            multiple *= 10;
        }
        multiple = 1;
        int num3 = 0;
        for(int i = targetWord.length()-1; i >= 0; i--){
            num3 += multiple * (targetWord.charAt(i)-97);
            multiple *= 10;
        }
        return num3 == (num1 + num2);
    }
}
