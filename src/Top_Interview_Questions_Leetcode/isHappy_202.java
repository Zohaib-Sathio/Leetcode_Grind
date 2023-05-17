package Top_Interview_Questions_Leetcode;

import java.util.HashSet;

public class isHappy_202 {
    /*
    Runtime
1 ms
Beats
90.18%
Memory
40.1 MB
Beats
24.28%
     */
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        while(n != 0 && !set.contains(n)){
            set.add(n);
            int num = 0;
            while(n != 0){
                int temp = n % 10;
                n = n / 10;
                num += (temp * temp);
            }
            n = num;
        }
        return n == 1;
    }
}
