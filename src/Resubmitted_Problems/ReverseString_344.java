package Resubmitted_Problems;

public class ReverseString_344 {
    /*
    Runtime: 1 ms, faster than 99.91% of Java online submissions for Reverse String.
Memory Usage: 54.9 MB, less than 51.79% of Java online submissions for Reverse String.
     */
    public void reverseString(char[] s) {
        int strt = 0, end = s.length - 1;
        while(strt < end){
            char temp = s[strt];
            s[strt++] = s[end];
            s[end--] = temp;
        }
    }
}
