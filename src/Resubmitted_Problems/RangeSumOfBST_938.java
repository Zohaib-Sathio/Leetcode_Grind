package Resubmitted_Problems;

public class RangeSumOfBST_938 {
    /*
    Runtime
1 ms
Beats
56.34%
Memory
49.7 MB
Beats
92.83%
     */
    public int rangeSumBST(BinaryTreeClass.TreeNode root, int low, int high) {

        return iterator(root, low, high, 0);
    }
    private static int iterator(BinaryTreeClass.TreeNode root, int low, int high, int sum){
        if(root == null){
            return 0;
        }

        sum = iterator(root.left, low, high, sum);

        if(low <= root.val && root.val <= high){
            sum += root.val;
        }
        sum += iterator(root.right, low, high, sum);
        return sum;
    }
}
