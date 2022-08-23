package LeetcodeFirstMonth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountItemsMatchingARule_1773 {

    /*
    Runtime: 3 ms, faster than 99.31% of Java online submissions for Count Items Matching a Rule.
Memory Usage: 47.1 MB, less than 93.90% of Java online submissions for Count Items Matching a Rule.
     */

    // Get items input as List<List<String>>
    public static int countTheMatching(List<List<String>> list, String ruleKey, String ruleValue){
        int matchingValues = 0;
        int ruleKeyNumber = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };


        for (List<String> item : list) {

            if (ruleKeyNumber == 0) {
                if (item.get(0).equals(ruleValue)) {
                    matchingValues++;
                }
            } else if (ruleKeyNumber == 1) {
                if (item.get(1).equals(ruleValue)) {
                    matchingValues++;
                }
            } else if (ruleKeyNumber == 2) {
                if (item.get(2).equals(ruleValue)) {
                    matchingValues++;
                }
            } }

            return matchingValues;
            //These double if conditions are checking two strings O(n*n) time complexity
//            if(ruleKey.equals("type")){
//                if(items[i][0].equals(ruleValue)){
//                    matchingValues++;
//                }
//            }
//            else if(ruleKey.equals("color")){
//                if(items[i][1].equals(ruleValue)){
//                    matchingValues++;
//                }
//            }
//            else if(ruleKey.equals("name")){
//                if(items[i][2].equals(ruleValue)){
//                    matchingValues++;
//                }
//            }
//        }

    }
    public static void main(String[] args) {
        List<List<String>> list = new LinkedList<>();
        List<String> subList1 = new LinkedList<>();
        subList1.add("phone");
        subList1.add("blue");
        subList1.add("pixel");
        List<String> subList2 = new LinkedList<>();
        subList2.add("computer");
        subList2.add("silver");
        subList2.add("lenovo");
        List<String> subList3 = new LinkedList<>();
        subList3.add("phone");
        subList3.add("gold");
        subList3.add("iphone");

        list.add(subList1);
        list.add(subList2);
        list.add(subList3);

//        String[][] items = {{"phone", "blue", "pixel"}, {"computer", "silver", "lenovo"},
//                          {"phone", "gold", "iphone"}};
//        List<List<String>> =  new LinkedList<LinkedList<String>>();
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countTheMatching(list, ruleKey, ruleValue));
    }
}
