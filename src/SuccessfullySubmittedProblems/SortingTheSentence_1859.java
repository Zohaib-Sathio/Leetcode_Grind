package SuccessfullySubmittedProblems;

/*
Runtime
1 ms
Beats
91.92%
Memory
39.8 MB
Beats
99.42%

 */
public class SortingTheSentence_1859 {
    public static String sortSentence(String s) {
        // iterate string and count number of words
        int totalWords = 0;
        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                totalWords += 1;
            }
        }
        // initialize the array
        String[] wordsArray = new String[totalWords + 1];

        // declare charactersCounter
        int charTracker = 0;
        // iterate string again
        for(int j = 0; j < s.length(); j++){
            // check if it is last character
            // retrive the number
            // get substring
            // add it in array
            if(j == s.length()-1){
                int index = Integer.parseInt(String.valueOf(s.charAt(j)));
                String subStr = s.substring(charTracker, j);
                wordsArray[index-1] = subStr;
            }

            //check if char is empty space
            // store prev number in variable
            // get substring from input string using pointer
            // add retrieved string to array
            // update the counter

            if(s.charAt(j) == ' '){
                int index = Integer.parseInt(String.valueOf(s.charAt(j-1)));
                String subStr = s.substring(charTracker, j-1);
                wordsArray[index-1] = subStr;
                charTracker = j + 1;
            }
        }


        // iterate over array
        // concetenate the elements into an string with spaces
        // return the string
        String returnString = "";
        for(int k = 0; k <= totalWords; k++){
            returnString = returnString.concat(wordsArray[k]).concat(" ");
        }
        return returnString;

    }

    public static void main(String[] args) {
//        String s = "is2 sentence4 This1 a3";
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
}
