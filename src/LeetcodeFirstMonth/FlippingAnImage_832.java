package LeetcodeFirstMonth;

import java.util.Arrays;


public class FlippingAnImage_832 {
     /*
     Runtime: 1 ms, faster than 78.56% of Java online submissions for Flipping an Image.
Memory Usage: 44.6 MB, less than 65.14% of Java online submissions for Flipping an Image.
      */

    // If we declare frequent used variables globally

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
Memory Usage: 42.5 MB, less than 92.78% of Java online submissions for Flipping an Image.
     */

    public static int[][] flipImage(int[][] image){
        int idx1, idx2; // more efficient
        for(int[] imagePart : image){
            idx1 = 0;
            idx2 = imagePart.length - 1;
            while (idx1 <= idx2){
                int temp = imagePart[idx1];
                imagePart[idx1++] = imagePart[idx2];
                imagePart[idx2--] = temp;
            }
            for (int i = 0; i < imagePart.length; i++) {
                if(imagePart[i] == 0){
                    imagePart[i] = 1;
                }
                else {
                    imagePart[i] = 0;
                }
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
        int[][] flippedImage = flipImage(image);
        for(int[] images : flippedImage){

            System.out.println(Arrays.toString(images));
        }
    }
}
