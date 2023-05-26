package Weekly_Contest.WC_346;

public class Lexicographically_smallest_palindrome {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int last = arr.length-1;
        int first = 0;
        while(first <= last){
            if(arr[first] > arr[last]){
                arr[first] = arr[last];
            }
            else if(arr[first] < arr[last]){
                arr[last] = arr[first];
            }
            first++;
            last--;
        }
        return String.valueOf(arr);
    }
}
