package LeetcodeFirstMonth;

import java.util.HashSet;
import java.util.Set;

public class CountingTheNumberOfConsistentStrings_1684 {

//    Runtime: 13 ms, faster than 77.43% of Java online submissions for Count the Number of Consistent Strings.
//    Memory Usage: 54.8 MB, less than 43.65% of Java online submissions for Count the Number of Consistent Strings.

    public static int countConsistentStrings(String allowed, String[] words){
        int consistentFound = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for(String word : words){
            for (int i = 0; i < word.length(); i++) {
                if(!set.contains(word.charAt(i))){
                    consistentFound--;
                    break;
                }
            }
            consistentFound++;
        }

        return consistentFound;
    }
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a", "ab", "dsa", "ava", "cba"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
