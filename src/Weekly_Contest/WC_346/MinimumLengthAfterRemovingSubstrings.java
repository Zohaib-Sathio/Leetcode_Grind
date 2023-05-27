package Weekly_Contest.WC_346;

public class MinimumLengthAfterRemovingSubstrings {
    public static int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")){
            if(s.length() == 2) return s.length();
            for(int i = 0; i < s.length()-1; i++){
                if(s.charAt(i) == 'A' && s.charAt(i+1) == 'B'){
                    s = s.substring(0, i) + s.substring(i+2);
                }
                else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                    s = s.substring(0, i) + s.substring(i+2);
                }
            }
        }
        return s.length();
    }
    //ABFCACDB

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
        String s = "FC";
        System.out.println(s.substring(0, 2) + s.substring(1));;
    }
}
