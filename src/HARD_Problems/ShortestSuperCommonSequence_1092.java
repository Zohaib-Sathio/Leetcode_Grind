package HARD_Problems;

public class ShortestSuperCommonSequence_1092 {
    /*
    Runtime: 39 ms, faster than 30.04% of Java online submissions for Shortest Common Supersequence .
Memory Usage: 50.8 MB, less than 14.61% of Java online submissions for Shortest Common Supersequence .
     */
    public static String shortestCommonSupersequence(String str1, String str2) {
        return helper(str1, str2, str1.length(), str2.length());
    }
    public static String helper(String s1, String s2, int m, int n){
        int[][] table = new int[m+1][n+1];
        for(int i = 0; i < m + 1; i++){
            for(int j = 0; j < n + 1; j++){
                if(i == 0 || j == 0){
                    table[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    table[i][j] = 1 + table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        String reverseStr = "";
        int i = m, j = n;
        while(i > 0 && j > 0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                reverseStr += s1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(table[i-1][j] > table[i][j-1]){
                    reverseStr += s1.charAt(i-1);
                    i--;
                }
                else{
                    reverseStr += s2.charAt(j-1);
                    j--;
                }
            }
        }
        while(i > 0){
            reverseStr += s1.charAt(i-1);
            i--;
        }
        while(j > 0){
            reverseStr += s2.charAt(j-1);
            j--;
        }
        String returnStr = "";
        for(int k = reverseStr.length()-1; k >= 0; k--){
            returnStr += reverseStr.charAt(k);
        }
        return returnStr;
    }

    public static void main(String[] args) {
        String a = "acabella";
        String b = "bellaciao";
        System.out.println(shortestCommonSupersequence(a, b));
    }
}
