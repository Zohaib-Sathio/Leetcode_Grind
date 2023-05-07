package DP_Problems;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle_119 {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        List<Integer> firstL = new LinkedList<Integer>();
        firstL.add(1);
        list.add(firstL);
        for(int i = 1; i < numRows; i++){
            List<Integer> temp = list.get(i-1);
            int[] temp2 = new int[temp.size() + 2];
            temp2[0] = 0;
            temp2[temp2.length -1] = 0;
            for(int j = 0; j < temp.size(); j++){
                temp2[j+1] = temp.get(j);
            }
            List<Integer> toAdd = new LinkedList<>();
            for(int k = 0; k < temp2.length-1; k++){
                toAdd.add(temp2[k] + temp2[k+1]);
            }
            list.add(toAdd);
        }
        return list.get(rowIndex);
    }
}
