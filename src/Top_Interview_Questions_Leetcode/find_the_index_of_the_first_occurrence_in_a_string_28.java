package Top_Interview_Questions_Leetcode;

public class find_the_index_of_the_first_occurrence_in_a_string_28 {
    /*
    Runtime
1 ms
Beats
36.9%
Memory
40.7 MB
Beats
53.34%
     */
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int total = 1;
                int first = 1;
                int j = i+1;
                while(first < needle.length() && j < haystack.length()){
                    if(haystack.charAt(j) == needle.charAt(first)){
                        total++;
                        j++;
                        first++;
                    }
                    else{
                        break;
                    }
                }
                if(total == needle.length()) return i;
            }
        }
        return -1;
    }
    //Trying second solution
    // Got it but is more expensive
    /*
    Runtime
30 ms
Beats
5.19%
Memory
42.5 MB
Beats
6.11%
     */
    public static int strStr2(String haystack, String needle) {
        char[] hayArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int matched = 0;
        int index = -1;
        int first = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(hayArr[i] == needleArr[first]){
                if(first == 0){
                    System.out.println(i);
                    index = i;
                }
                matched++;
                first++;
            }
            else{
                System.out.println(matched + " matched");

                if(index > -1 && matched > 0){
                    i = index;
                }
                matched = 0;
                first = 0;
                System.out.println(i + " setting index to");
            }
            if(matched == needle.length()){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "mississippi";
        String t = "issip";
        System.out.println(strStr2(s,t) + " Output");
    }
}
