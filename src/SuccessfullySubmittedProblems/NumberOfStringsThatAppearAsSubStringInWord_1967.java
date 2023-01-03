package SuccessfullySubmittedProblems;

/*
Runtime
0 ms
Beats
100%
Memory
41 MB
Beats
78.98%
 */
public class NumberOfStringsThatAppearAsSubStringInWord_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "a1g3g5";
        for(int i = 0; i< s.length();i +=2){
            // s.replace(s.charAt(i), s.charAt(i)+Integer.parseInt(String.valueOf(s.charAt(i))));
            s = s.substring(0, i-1) + s.charAt(i+1)+Integer.parseInt(String.valueOf(s.charAt(i+1))) + s.substring(i);
        }
        System.out.println(s);
    }
}

