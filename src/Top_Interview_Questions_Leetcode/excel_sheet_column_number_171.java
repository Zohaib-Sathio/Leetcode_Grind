package Top_Interview_Questions_Leetcode;

public class excel_sheet_column_number_171 {
    public int titleToNumber(String str) {
        int res = 0;
        int index = 0;
        for(int i = str.length()-2; i >= 0; i--){
            res += (str.charAt(i) - 'A'+1) * getInteger(index+1);
            index++;
        }
        res += (str.charAt(str.length()-1) - 'A' + 1);

        return res;
    }
    public static int getInteger(int n){
        int res = 1;
        while(n > 0){
            res *= 26;
            n--;
        }
        return res;
    }
}
