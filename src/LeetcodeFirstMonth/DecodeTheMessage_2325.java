package LeetcodeFirstMonth;

import java.util.HashMap;

public class DecodeTheMessage_2325 {

//    Runtime: 8 ms, faster than 63.71% of Java online submissions for Decode the Message.
//    Memory Usage: 42.8 MB, less than 79.93% of Java online submissions for Decode the Message.

    public static String decodeMessage(String key, String message){
        char[] decodedMessage = new char[message.length()];
        String englishAlphabets = "abcdefghijklmnopqrstuvwxyz";
        int idx = 0;
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if(hashMap.containsKey(key.charAt(i)) || key.charAt(i) == ' '){
                continue;
            }
            hashMap.put(key.charAt(i), englishAlphabets.charAt(idx++));
        }
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                decodedMessage[i] = ' ';
                continue;
            }
            decodedMessage[i] = hashMap.get(message.charAt(i));
        }

        return new String(decodedMessage);
    }
    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(decodeMessage(key, message));

    }
}
