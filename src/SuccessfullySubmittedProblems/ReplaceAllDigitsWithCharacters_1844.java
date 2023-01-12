package SuccessfullySubmittedProblems;

public class ReplaceAllDigitsWithCharacters_1844 {
    /*
    Runtime
7 ms
Beats
33.45%
Memory
42.6 MB
Beats
24.70%
     */
    public String replaceDigits(String s) {
        String newString = "";
        for(int i = 0; i< s.length();i++){
            if(i%2 != 0){
                char as =(char) (s.charAt(i-1) + Integer.parseInt(String.valueOf(s.charAt(i))));
                newString += as;
            }
            else{
                newString += s.charAt(i);
            }
        }
        return newString;

        /*
        for(int i = 1; i < s.length(); i+=2){
        char as =(char) (s.charAt(i-1) + Integer.parseInt(String.valueOf(s.charAt(i))));
        s = s.substring(0,i) + as + s.substring(i+1);
    }
    return s;
         */
    }

    public static void main(String[] args) {
        String a = "a1";
        System.out.println(a.charAt(0) + Integer.parseInt(String.valueOf(a.charAt(1))));
    }
}
