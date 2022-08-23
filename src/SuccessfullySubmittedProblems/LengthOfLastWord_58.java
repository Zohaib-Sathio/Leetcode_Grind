package SuccessfullySubmittedProblems;

public class LengthOfLastWord_58 {
    /*
    Runtime: 19 ms, faster than 5.77% of Java online submissions for Length of Last Word.
Memory Usage: 48.7 MB, less than 5.33% of Java online submissions for Length of Last Word.
     */
    //Need more optimization

    public int lengthOfLastWord(String s) {
        String lastWord = "";
        String returnWord = "";
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(lastWord.length() != 0){
                    returnWord = lastWord;
                }
                lastWord = "";
                continue;
            }
            lastWord += s.charAt(i);
        }
        if(lastWord.length() == 0){
            return returnWord.length();
        }

        return lastWord.length();
    }
    public static void main(String[] args) {

    }
}
