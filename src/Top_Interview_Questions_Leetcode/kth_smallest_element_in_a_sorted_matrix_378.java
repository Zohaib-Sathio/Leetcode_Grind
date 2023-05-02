package Top_Interview_Questions_Leetcode;

import java.util.Arrays;

public class kth_smallest_element_in_a_sorted_matrix_378 {
    public int kthSmallest(int[][] matrix, int k) {
        int index = 0;
        int[] ans = new int[matrix.length * matrix.length];
        for(int[] mat : matrix){
            for(int num : mat){
                ans[index] = num;
                index++;
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}
