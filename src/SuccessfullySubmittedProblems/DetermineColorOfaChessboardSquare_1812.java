package SuccessfullySubmittedProblems;

public class DetermineColorOfaChessboardSquare_1812 {
    /*
    Runtime
0 ms
Beats
100%
Memory
39.9 MB
Beats
91.3%
     */
    public boolean squareIsWhite(String coordinates) {
        int num = coordinates.charAt(0) + Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        if(num % 2 == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "";
        s += (char)97;
        System.out.println(s);
    }
}
