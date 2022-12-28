package SuccessfullySubmittedProblems;

public class FindTheHighestAltitude_1732 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.1 MB
Beats
80.53%
     */
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int altitude = 0;
        for(int i  = 0; i < gain.length; i ++){
            altitude += gain[i];
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}
