package Top_Interview_Questions_Leetcode;

import java.util.Arrays;

public class PlusOne_66 {
    //Failed for larger test cases
    /*
    [7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6]
     */
    public static int[] plusOne(int[] digits) {
        long num = 0;
        for(int digit :  digits){
            num = (num * 10) + digit;
        }
        int size = 0 ;
        num++;
        long temp = num;
        while(temp != 0){
            temp /= 10;
            size++;
        }
        int[] ans = new int[size];
        while(num != 0){
//            System.out.println("num: "+ num%10);
//            System.out.println("num: "+ num);
            ans[size-1] = (int) (num%10);
            num /= 10;
            size--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
