package LeetcodeFirstMonth;

public class ReversePrefixOfWord_2000 {

//    Runtime: 1 ms, faster than 83.09% of Java online submissions for Reverse Prefix of Word.
//    Memory Usage: 41.8 MB, less than 76.46% of Java online submissions for Reverse Prefix of Word.

    public static String reversePrefix(String word, char character){
        int pointer1 = 0;
        int pointer2 = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == character){
                break;
            }
            pointer2++;
            if(pointer2 == word.length()){
                pointer2 = 0;
            }
        }

        char[] newWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if(pointer2 >= pointer1){
                newWord[i] = word.charAt(pointer2--);
            }
            else{
                newWord[i] = word.charAt(i);
            }
        }

        return new String(newWord);
    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char character = 'z';
        System.out.println(reversePrefix(word, character));
    }
}
