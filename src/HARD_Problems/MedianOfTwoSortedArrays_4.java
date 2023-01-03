package HARD_Problems;

public class MedianOfTwoSortedArrays_4 {
    /*
    Runtime
2 ms
Beats
100%
Memory
43 MB
Beats
96.46%
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] sortedArray = new int[total];
        int frst = 0;
        int scnd = 0;
        int index = 0;
        while(frst < nums1.length && scnd < nums2.length){
            if(nums1[frst] < nums2[scnd]){
                sortedArray[index++] = nums1[frst++];
            }
            else{
                sortedArray[index++] = nums2[scnd++];
            }
        }
        while(frst < nums1.length){
            sortedArray[index++] = nums1[frst++];
        }
        while(scnd < nums2.length){
            sortedArray[index++] = nums2[scnd++];
        }
        if(total % 2 != 0){
            return sortedArray[total/2];
        }
        else{
            return (sortedArray[total/2] + sortedArray[total/2-1])/2.0;
        }
    }
}
