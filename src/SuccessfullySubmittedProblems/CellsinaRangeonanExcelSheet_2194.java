package SuccessfullySubmittedProblems;

import java.util.LinkedList;
import java.util.List;

/*
Runtime
6 ms
Beats
72.47%
Memory
43.5 MB
Beats
73.95%
 */

public class CellsinaRangeonanExcelSheet_2194 {

    public static List<String> cellsInRange(String s) {
        List<String> returningList = new LinkedList<>();
        int start = Integer.parseInt(String.valueOf(s.charAt(1)));
        int end = Integer.parseInt(String.valueOf(s.charAt(4)));
        char startingCharacter = s.charAt(0);
        char endingCharacter = s.charAt(3);
        int repeat = Character.getNumericValue(endingCharacter) - Character.getNumericValue(startingCharacter);
        for (int i = 0; i <= repeat; i++) {
            int temp = start;
            while (temp <= end){
                String string = startingCharacter+""+temp;

                returningList.add(string);
                temp++;
            }
            startingCharacter +=1;
        }
//        System.out.println(Character.compare(startingCharacter, endingCharacter) + " " + startingCharacter);


        return returningList;
    }

    public static void main(String[] args) {
        String s = "A1:F1";
//        System.out.println(Character.getNumericValue('F') - Character.getNumericValue('A'));
//        System.out.println(Character.getNumericValue('L'));
        List new_list = cellsInRange(s);
        System.out.println(new_list);
    }
}
