package HARD_Problems;

public class TrappingRainWater_42 {

    //Second attempt solution
    /*
    Runtime
1 ms
Beats
99.34%
Memory
43.5 MB
Beats
24.21%
     */
    public int trap2(int[] height) {
        int rain = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        int left = 0;
        for(int i = 0; i < height.length; i++){
            leftMax[i] = left;
            if(left < height[i]) left = height[i];
        }
        int right = 0;
        for(int i = height.length - 1; i > 0; i--){
            rightMax[i] = right;
            if(right < height[i]) right = height[i];
        }
        int[] minOfBoth = new int[height.length];
        for(int i = 0; i < height.length; i++){
            minOfBoth[i] = Math.min(leftMax[i], rightMax[i]);
        }
        for(int i = 0; i < height.length; i++){
            int temp = minOfBoth[i] - height[i];
            if(temp > 0){
                rain += temp;
            }
        }


        return rain;
    }


    /*
    Runtime
253 ms
Beats
5.15%
Memory
43.2 MB
Beats
43.58%
     */
    public int trap(int[] height) {
        int right = 0;
        for(int n : height){
            if(n > right){
                right = n;
            }
        }
        int left = 0;
        int rain = 0;
        for(int i = 0; i < height.length; i++){
            int temp = Math.min(left, right) - height[i];
            if(temp > 0){
                rain += temp;
            }
            left = Math.max(left, height[i]);
            if(height[i] >= right){
                right = newRight(height, height[i], i);
            }
        }
        return rain;
    }
    private static int newRight(int[] height, int curRight, int index){
        int newR = 0;
        for(int i = index+1; i < height.length; i++){
            if(height[i] > newR){
                newR = height[i];
            }
        }
        return newR;
    }
}
