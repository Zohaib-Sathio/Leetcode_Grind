package SuccessfullySubmittedProblems;

public class ReplaceElementsWithGreatestElementOnRightSide_1299 {
    /*
    Runtime
1002 ms
Beats
13.9%
Memory
45 MB
Beats
88.97%
     */
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[i] = -1;
                return arr;
            }
            int leftGreatest = greatestNum(arr, i);
            arr[i] = leftGreatest;
        }
        return arr;
    }
    private static int greatestNum(int[] arr, int index){
        int great = arr[index+1];
        for(int i = index+1; i < arr.length; i++){
            great = Math.max(great, arr[i]);
        }
        return great;
    }
}
