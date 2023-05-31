package Top_Interview_Questions_Leetcode;

public class ReverseInteger_07 {
    /*
    Runtime
1 ms
Beats
100%
Memory
40.1 MB
Beats
49.22%
     */
    public int reverse(int x) {
        long num = 0;
        while(x != 0){
            num *= 10;
            num += x%10;
            x = x/10;
            if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) return 0;
        }
        return (int)num;
    }
}
