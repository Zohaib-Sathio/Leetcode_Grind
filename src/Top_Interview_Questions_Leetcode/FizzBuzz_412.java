package Top_Interview_Questions_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new LinkedList();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                ans.add("Fizz");
            }
            else if(i % 5 == 0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
