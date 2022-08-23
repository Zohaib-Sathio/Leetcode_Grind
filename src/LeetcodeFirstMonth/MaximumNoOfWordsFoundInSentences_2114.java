package LeetcodeFirstMonth;

public class MaximumNoOfWordsFoundInSentences_2114 {
//    Runtime: 3 ms, faster than 96.02% of Java online submissions for Maximum Number of Words Found in Sentences.
//    Memory Usage: 42.6 MB, less than 79.55% of Java online submissions for Maximum Number of Words Found in Sentences.
    public static int countWords(String[] sentences){
        int maximumWords = 0;
        for(String sentence : sentences){
            int totalWords = totalWordsInSentence(sentence);
            //Do not use in-built funtions
//            maximumWords = max(maximumWords, totalWords);
            maximumWords = (maximumWords > totalWords)? maximumWords : totalWords;
        }
        return maximumWords;
    }
    public static int totalWordsInSentence(String sentence){
        int words = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                words++;
            }
        }
        return words;
    }


    //From leetcode || With help of split method
//    class Solution {
//        public int mostWordsFound(String[] sentences) {
//            int max=0;
//            for(int i=0; i<sentences.length; i++) {
//                max = Math.max(max,(sentences[i].split(" ")).length);
//            }
//            return max;
//        }
//    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too",
                        "this is great thanks very much"};
        System.out.println(countWords(sentences));
    }
}
