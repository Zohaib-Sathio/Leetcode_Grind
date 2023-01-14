package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfNumber_17 {
    /*
    Runtime
6 ms
Beats
38.67%
Memory
42.2 MB
Beats
60.59%
     */
    public static List<String> letterCombinations(String digits) {
        if(digits.length() < 1){
            return new ArrayList<String>();
        }
        char[] strChars = digits.toCharArray();
//        char[] str = new char[digits.length()];
        List<String> ans = new ArrayList();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        findComb(0, "", strChars, ans, map);
        return ans;
    }
    private static void findComb(int index, String str, char[] digits, List<String> ans, HashMap<Integer, String> map){
        if(index == digits.length){
            ans.add(str);
            // System.out.println(str);
            return;
        }
        String temp = map.get(Character.getNumericValue(digits[index]));
        for (int i = 0; i < temp.length(); i++) {
            str += temp.charAt(i);
            findComb(index+1, str, digits, ans, map);
            str = str.substring(0, str.length()-1);
        }
    }

    public static void main(String[] args) {
        String str = "23";
//        System.out.println('a');
        List<String> list = letterCombinations(str);
        System.out.println(list);
        

//        String temp = map.get(Character.getNumericValue('5'));
//        for (int i = 0; i < temp.length(); i++) {
//            System.out.println(temp.charAt(i));
//        }
    }

}
