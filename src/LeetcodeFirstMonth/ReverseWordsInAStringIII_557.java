package LeetcodeFirstMonth;

public class ReverseWordsInAStringIII_557 {

    /*
    Runtime: 6 ms, faster than 85.23% of Java online submissions for Reverse Words in a String III.
Memory Usage: 42.7 MB, less than 94.91% of Java online submissions for Reverse Words in a String III.
     */

    //Having problem in last character of the string
    // Update: Fixed
    public static String reverseWords(String s){
        char[] reversedString = new char[s.length()];
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == ' '){
                int temp = idx2 - 1;
                while (idx1 < idx2){
                    reversedString[idx1++] = s.charAt(temp--);
                }
                reversedString[idx1++] = s.charAt(idx2);
            }
            else if(i == s.length() - 1){

                reversedString[idx1++] = s.charAt(idx2);
                int temp = idx2 - 1;
                while (idx1 <= idx2){
                    reversedString[idx1++] = s.charAt(temp--);
                }
            }
            idx2++;
        }
        return new String(reversedString);
    }
    public static void main(String[] args) {
//        String s = "Let's take Leetcode contest";
        String s = "God ding";
                //  12345
                //  s'tel
        System.out.println(reverseWords(s));

    }
}
