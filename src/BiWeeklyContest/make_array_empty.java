package BiWeeklyContest;

import java.util.ArrayList;

public class make_array_empty {
    // Time Limit Exceeded

    public long countOperationsToEmptyArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        for(int num : nums){
            list.add(num);
        }
        int count = 0;
        while(!list.isEmpty()){
            int smallest = Integer.MAX_VALUE;
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) < smallest){
                    smallest = list.get(i);
                }
            }
            if(list.get(0) == smallest){
                list.remove(0);
            }
            else{
                int temp = list.get(0);
                list.remove(0);
                list.add(temp);
            }
            count++;
        }
        return count;
    }
}
