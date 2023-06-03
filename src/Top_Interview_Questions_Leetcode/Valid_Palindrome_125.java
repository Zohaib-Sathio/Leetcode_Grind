package Top_Interview_Questions_Leetcode;

public class Valid_Palindrome_125 {

    //Second Solution

    /*
    Runtime
3 ms
Beats
97.97%
Memory
42.5 MB
Beats
88.47%
     */
    public boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        int first = 0;
        int last = s.length() - 1;
        while(first <= last){
            if((s.charAt(first) >= 97 && s.charAt(first) <= 122) || (s.charAt(first) >= 48 && s.charAt(first) <= 57)){
                if((s.charAt(last) >= 97 && s.charAt(last) <= 122) || (s.charAt(last) >= 48 && s.charAt(last) <= 57)){
                    if(s.charAt(first) != s.charAt(last)) return false;
                    first++;
                    last--;
                }
                else{
                    last--;
                }
            }
            else{
                first++;
            }
        }
        return true;
    }

    //First Solution
    /*
    Runtime
306 ms
Beats
24.92%
Memory
45.7 MB
Beats
5.42%
     */
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                str.append(s.charAt(i));
            }
            else if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                char c = s.charAt(i);
                str.append(c);
            }
            else if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                str.append(s.charAt(i));
            }
        }
        str = new StringBuilder(str.toString().toLowerCase());
        int first = 0;
        int last = str.length() - 1;
        while(first <= last){
            if(str.charAt(first) != str.charAt(last)) return false;
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
