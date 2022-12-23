package SuccessfullySubmittedProblems;

/*
Runtime
2 ms
Beats
88.2%
Memory
40 MB
Beats
98.37%
 */

public class CountAsterisks_2315 {
    public int countAsterisks(String s) {
        boolean canAdd = true;
        int totalAsterisks = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                canAdd = !canAdd;
            }
            if(s.charAt(i) == '*'){
                if(canAdd){
                    totalAsterisks += 1;
                }
            }
        }
        return totalAsterisks;
    }

    public static void main(String[] args) {
        char s = 65;
        int d = s+32;
        char f = (char) d;
        String ss = "asdfjks";
        System.out.println(ss);
        ss = ss.replace(ss.charAt(0), (char) (ss.charAt(0)-32));
        System.out.println(ss);
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
    }
}
