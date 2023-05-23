package Top_Interview_Questions_Leetcode;

public class MergeSortedArray_88 {
    /*
    Runtime
0 ms
Beats
100%
Memory
41.5 MB
Beats
98.50%
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int index = 0;
        int i = 0;
        int j = 0;
        while(m > 0 && n > 0){
            if(nums1[i] < nums2[j]){
                ans[index] = nums1[i];
                m--;
                i++;
            }
            else{
                ans[index] = nums2[j];
                n--;
                j++;
            }
            index++;
        }
        while(m > 0){
            ans[index++] = nums1[i++];
            m--;
        }
        while(n > 0){
            ans[index++] = nums2[j++];
            n--;
        }
        for(int k = 0; k < ans.length; k++){
            nums1[k] = ans[k];
        }
    }
}
