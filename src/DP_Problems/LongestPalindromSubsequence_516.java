package DP_Problems;

public class LongestPalindromSubsequence_516 {
    /*
    Runtime: 171 ms, faster than 14.68% of Java online submissions for Longest Palindromic Subsequence.
Memory Usage: 75 MB, less than 7.47% of Java online submissions for Longest Palindromic Subsequence.
     */
    public int longestPalindromeSubseq(String s) {
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        int[][] table = new int[s.length() + 1][s.length() + 1];
        for(int i = 0; i < s.length() + 1; i++){
            for(int j = 0; j < s.length() + 1; j++){
                if(i == 0 || j == 0){
                    table[i][j] = 0;
                }
            }
        }
        return helper(s, reverse, s.length(), reverse.length(), table);
    }
    public static int helper(String s1, String s2, int m, int n, int[][] table){
        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    table[i][j] = 1 + table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i-1][j] , table[i][j-1]);
                }
            }
        }
        return table[m][n];
    }
}
