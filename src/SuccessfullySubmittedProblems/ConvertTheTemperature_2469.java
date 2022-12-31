package SuccessfullySubmittedProblems;

public class ConvertTheTemperature_2469 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.8 MB
Beats
85.84%
     */
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[0] = celsius + 273.15;
        arr[1] = celsius * 1.80 + 32.0;
        return arr;
        // return new double[(celsius + 273.15), (celsius * 1.80 + 32.0)];
    }
}
