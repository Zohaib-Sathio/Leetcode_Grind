package Top_Interview_Questions_Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ValidParantheses_20 {
    /*
    Runtime
Runtime
2 ms
Beats
89.64%
Memory
40.6 MB
Beats
57.45%
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Character prev = '(';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                prev = s.charAt(i);
            }
            else{
                if(stack.isEmpty()) return false;
                Character temp = stack.pop();
                if(s.charAt(i) == ')') prev = '(';
                else if(s.charAt(i) == '}') prev = '{';
                else if(s.charAt(i) == ']') prev = '[';
                if(prev!= temp) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
