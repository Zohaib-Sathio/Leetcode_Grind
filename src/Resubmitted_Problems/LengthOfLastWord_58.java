package Resubmitted_Problems;

public class LengthOfLastWord_58 {
    // Previous result was 19 ms!!
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
Memory Usage: 42.4 MB, less than 30.99% of Java online submissions for Length of Last Word.
     */
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(length != 0){
                    return length;
                }
            }
            else{
                length++;
            }
        }
        return  length;
    }
}
