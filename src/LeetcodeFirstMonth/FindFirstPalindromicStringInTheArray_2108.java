package LeetcodeFirstMonth;

public class FindFirstPalindromicStringInTheArray_2108 {

    /*
    Runtime: 3 ms, faster than 91.99% of Java online submissions for Find First Palindromic String in the Array.
Memory Usage: 42.7 MB, less than 86.45% of Java online submissions for Find First Palindromic String in the Array.
     */
    public static String findPalindromicString(String[] strings){
        for(String string : strings){
            int lastIndex = string.length() - 1;
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) != string.charAt(lastIndex--)){
                    break;
                }
                if(i >= lastIndex){
                    return string;
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] strings = {"zohaib", "ab", "afaa", "DSASD"};
        System.out.println(findPalindromicString(strings));
    }
}
