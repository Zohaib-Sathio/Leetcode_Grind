package SuccessfullySubmittedProblems;

public class GenerateStringWithCharactersThatHaveOddCounts_1374 {
    /*
    Runtime
11 ms
Beats
6.40%
Memory
42.8 MB
Beats
26.55%
     */
    public String generateTheString(int n) {
        int temp = n;
        int num = 97;
        int counter = 0;
        String returnStr = "";
        while(n > 1){
            if(counter == 25){
                temp -= counter;
                num++;
                counter = 0;
            }
            returnStr += (char) num;
            counter++;
            n--;
        }
        if(temp % 2 == 0){
            num++;
        }

        returnStr += (char) num;

        return returnStr;
    }

}
