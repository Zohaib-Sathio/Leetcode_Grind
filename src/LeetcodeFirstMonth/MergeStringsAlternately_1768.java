package LeetcodeFirstMonth;

public class MergeStringsAlternately_1768 {
    /*
    Runtime: 2 ms, faster than 45.05% of Java online submissions for Merge Strings Alternately.
Memory Usage: 42 MB, less than 79.42% of Java online submissions for Merge Strings Alternately.
     */
    public static String mergeWordsAlternately(String word1, String word2){
        int size = word1.length() + word2.length();
        char[] mergedString = new char[size];
        int word1Pointer = 0, word2Pointer = 0;
        for (int i = 0; i < size; i++) {
            if(i%2 == 0){
                if(word1Pointer < word1.length()){
                    mergedString[i] = word1.charAt(word1Pointer++);
                    continue;
                }
            }
            if(word2Pointer < word2.length()){
                mergedString[i] = word2.charAt(word2Pointer++);
            }
            else{
                mergedString[i] = word1.charAt(word1Pointer++);
            }

        }
        return new String(mergedString);
    }
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqrst";
        System.out.println(mergeWordsAlternately(word1, word2));
    }
}
