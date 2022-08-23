package LeetcodeFirstMonth;

import java.util.LinkedList;
import java.util.List;

public class KidWithManyCandies_1431 {
    /*
    Runtime: 1 ms, faster than 98.89% of Java online submissions for Kids With the Greatest Number of Candies.
Memory Usage: 43 MB, less than 55.75% of Java online submissions for Kids With the Greatest Number of Candies.
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList();
        int greatestNum = candies[0];
        for(int num : candies){
            if(num > greatestNum){
                greatestNum = num;
            }
        }
        for(int i = 0; i < candies.length; i++){
            int totalCandies = candies[i] + extraCandies;
            if(totalCandies >= greatestNum){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
