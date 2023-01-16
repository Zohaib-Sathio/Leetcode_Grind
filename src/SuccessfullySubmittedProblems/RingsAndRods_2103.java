package SuccessfullySubmittedProblems;

public class RingsAndRods_2103 {
    /*
    Runtime
1 ms
Beats
88.95%
Memory
40.2 MB
Beats
90.39%
     */
    public int countPoints(String rings) {
        boolean[] r = new boolean[10];
        boolean[] g = new boolean[10];
        boolean[] b = new boolean[10];

        for(int i = 0; i < rings.length(); i+=2){
            if(rings.charAt(i) == 'R'){
                r[Integer.parseInt(String.valueOf(rings.charAt(i+1)))] = true;
            }
            else if(rings.charAt(i) == 'G'){
                g[Integer.parseInt(String.valueOf(rings.charAt(i+1)))] = true;
            }
            else{
                b[Integer.parseInt(String.valueOf(rings.charAt(i+1)))] = true;
            }
        }
        int count = 0;
        int n = 0;
        while(n < 10){
            if(r[n] && g[n] && b[n]){
                count++;
            }
            n++;
        }
        return count;
    }
}
