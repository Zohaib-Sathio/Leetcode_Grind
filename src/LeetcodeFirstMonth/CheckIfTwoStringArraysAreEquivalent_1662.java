package LeetcodeFirstMonth;

public class CheckIfTwoStringArraysAreEquivalent_1662 {

//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If Two String Arrays are Equivalent.
//    Memory Usage: 42.8 MB, less than 8.73% of Java online submissions for Check If Two String Arrays are Equivalent.

    //Letssss Go Babyyy
    public static boolean checkWords(String[] word1, String[] word2){
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();

        for (String s : word1) {
            firstString.append(s);
        }
        for (String s : word2) {
            secondString.append(s);
        }
        return firstString.toString().equals(secondString.toString());
    }
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(checkWords(word1, word2));
    }
}
