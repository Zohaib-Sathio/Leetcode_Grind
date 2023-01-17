package SuccessfullySubmittedProblems;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople_2418 {
    /*
    Runtime
79 ms
Beats
5.14%
Memory
43.1 MB
Beats
80.75%
     */
    public String[] sortPeople(String[] names, int[] heights) {
        int greatest = 0;
        for(int height : heights){
            greatest = Math.max(greatest, height);
        }
        HashMap<Integer, String> map = new HashMap();
        for(int i = 0; i < names.length;i++){
            map.put(heights[i], names[i]);
        }
        String[] toReturn = new String[heights.length];
        int index = 0;
        while(greatest > 0){
            if(map.containsKey(greatest)){
                toReturn[index++] = map.get(greatest);
            }
            greatest--;
        }
        return toReturn;
    }

    public String[] sortPeople2(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap();
        for(int i = 0; i < names.length;i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] toReturn = new String[heights.length];
        int index = 0;
        for(int i = heights.length-1; i >= 0;i--){
            toReturn[index++] = map.get(heights[i]);
        }
        return toReturn;
    }

}
