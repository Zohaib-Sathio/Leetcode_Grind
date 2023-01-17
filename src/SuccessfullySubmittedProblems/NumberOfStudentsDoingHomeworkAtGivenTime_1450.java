package SuccessfullySubmittedProblems;

public class NumberOfStudentsDoingHomeworkAtGivenTime_1450 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.3 MB
Beats
89.46%
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i = 0; i < startTime.length; i++){
            if(endTime[i] >= queryTime && startTime[i] <= queryTime){
                count++;
            }
        }
        return count;
    }
}
