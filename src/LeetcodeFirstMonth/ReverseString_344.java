package LeetcodeFirstMonth;

public class ReverseString_344 {

    /*
    Runtime: 1 ms, faster than 99.91% of Java online submissions for Reverse String.
Memory Usage: 58.2 MB, less than 12.39% of Java online submissions for Reverse String.
     */
    public static void reverseString(char[] chars){
        int idx1 = 0, idx2 = chars.length - 1;
        while (idx1 <= idx2){
            char temp = chars[idx1];
            chars[idx1++] = chars[idx2];
            chars[idx2--] = temp;
        }
    }
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
//        char[] chars = {'d','o'};
        reverseString(chars);
        System.out.println(chars);
    }
}
