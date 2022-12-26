package SuccessfullySubmittedProblems;

import java.util.Locale;

/*
Runtime
1 ms
Beats
77.69%
Memory
40.2 MB
Beats
95.18%
 */
public class ToLowerCase_709 {

    public String toLowerCase(String s) {
        //Traverse the string
        //Check if it is Upper cased character
        //replace the upper cased char with lower
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                s = s.replace(s.charAt(i), (char)(s.charAt(i)+32));
            }
        }
        return s;
    }

    /*
    Second Solution
    Runtime
0 ms
Beats
100%
Memory
40.6 MB
Beats
78.30%
     */
    public String toLowerCase2(String s) {
        return s.toLowerCase();
    }

}
