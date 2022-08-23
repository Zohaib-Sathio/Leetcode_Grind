import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//Will solve it later...where I can focus


// Tried many times but couldn't solve.. I guess I am trying the wrong approach here!!!
public class TopKFrequentElements_347 {
    public static int[] frequentElements(int[] nums, int k){
        int[] frequentElementsArray = new int[k];
        int kthNum = 0;
        Set<Integer> set = new HashSet<>();
        int times = k;
        while (times > 0){
            // 1 1 8
            int count = 1, index = -1, bigCount = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if(i == nums.length -2){
                    System.out.println("sfsa");
                    if(nums[i] != nums[i+1]){
                        if(kthNum < k){
                            if(!set.contains(nums[i + 1])){
                                frequentElementsArray[kthNum++] = nums[i+1];
                            }
                            break;
                        }
                    }
                }
                if(nums[i] == nums[i+1]){
                    count++;
                }
                else {
                    count = 1;
                }
                if(count >= bigCount){
                    if(!set.contains(nums[i])){
                        bigCount = count;
                        index = i;
                    }
                }
            }
            if(kthNum < k){
                set.add(nums[index]);
                frequentElementsArray[kthNum] = nums[index];
                System.out.println(frequentElementsArray[kthNum]);
                kthNum++;
            }
            times--;
        }

        return frequentElementsArray;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,8,9};
        int k = 5;
        System.out.println(Arrays.toString(frequentElements(nums, k)));
    }
}
