package LeetcodeFirstMonth;

public class ShuffleString_1528 {
    public static String shuffleString(String s, int[] in){


        //I was adding indices[i]th character to ith position but
        // I have to add ith character to indices[i]th position
        //        String returnString = "";
//        for (int i = 0; i < indices.length; i++) {
//            returnString += stringToShuffle.charAt(indices[i]);
//        }
//        return returnString;

//        Runtime: 1 ms, faster than 100.00% of Java online submissions for Shuffle String.
//        Memory Usage: 42.3 MB, less than 95.15% of Java online submissions for Shuffle String.

         char[] c = new char[in.length];
         for(int i = 0; i < in.length; i++)
             c[in[i]] = s.charAt(i);
         return new String(c);
    }
    public static void main(String[] args) {
        String stringToShuffle = "codeleet";
//        String stringToShuffle = "zohaib";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
//        int[] indices = {5, 4, 3, 2, 1, 0};
        System.out.println(shuffleString(stringToShuffle, indices));
    }
}
