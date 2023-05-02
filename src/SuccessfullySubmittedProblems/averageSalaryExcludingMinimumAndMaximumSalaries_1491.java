package SuccessfullySubmittedProblems;

public class averageSalaryExcludingMinimumAndMaximumSalaries_1491 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.5 MB
Beats
29.30%
     */
    public double average(int[] salary) {
        int minimum = salary[0];
        int maximum = salary[0];
        double sum = 0;
        for(int sal : salary){
            if(sal < minimum) minimum = sal;
            if(sal > maximum) maximum = sal;
            sum += sal;
        }
        sum = sum - minimum - maximum;
        return sum/(salary.length-2);
    }
}
