package Top_Interview_Questions_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class generate_parantheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList();
        generate(list, "(", n, 1,0);
        return list;
    }
    public static void generate(List<String> list, String str, int n, int left, int right){
        if(str.length() == n*2){
            if(left == right){
                list.add(str);
                return;
            }
            return;
        }
        else if(left > n || right > n || right > left){
            return;
        }
        else{
            // for(int i = 0; i < n ; i++){
            str += "(";
            generate(list, str, n, left+1, right);
            str = str.substring(0, str.length()-1);
            // left = left - 1;
            str += ")";
            generate(list, str, n, left, right+1);
            str = str.substring(0, str.length()-1);
            // }
        }
    }
}
