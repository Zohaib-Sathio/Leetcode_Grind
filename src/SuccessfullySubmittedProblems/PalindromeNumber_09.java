package SuccessfullySubmittedProblems;

public class PalindromeNumber_09 {

    /*
    Runtime: 16 ms, faster than 39.62% of Java online submissions for Palindrome Number.
Memory Usage: 45.3 MB, less than 29.73% of Java online submissions for Palindrome Number.
     */
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        int length = numStr.length() - 1;
        for(int i = 0; i < numStr.length(); i++){
            if(numStr.charAt(i) != numStr.charAt(length--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
