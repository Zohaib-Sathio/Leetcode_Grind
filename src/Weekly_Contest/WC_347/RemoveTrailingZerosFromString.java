package Weekly_Contest.WC_347;

public class RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        while(num.charAt(num.length()-1) == '0'){
            num = num.substring(0, num.length()-1);
        }
        return num;
    }
}
