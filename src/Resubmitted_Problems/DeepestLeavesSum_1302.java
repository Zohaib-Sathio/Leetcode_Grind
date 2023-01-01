package Resubmitted_Problems;

public class DeepestLeavesSum_1302 {
    /*
    Runtime
3 ms
Beats
79.86%
Memory
44.7 MB
Beats
85.2%
     */
    public int deepestLeavesSum(BinaryTreeClass.TreeNode root) {
        int height = heightOfTree(root, 0);
        int deepSum = deepSum(root, height, 0, 1);
        return deepSum;
    }
    private static int deepSum(BinaryTreeClass.TreeNode root, int height, int sum, int currHeight){
        if(root == null){
            return 0;
        }
        sum = deepSum(root.left, height, sum, currHeight+1);
        if(currHeight == height){
            sum += root.val;
        }
        sum += deepSum(root.right, height, sum, currHeight+1);
        return sum;
    }
    private static int heightOfTree(BinaryTreeClass.TreeNode root, int height){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left, height + 1);
        int rightHeight = heightOfTree(root.right, height + 1);

        return Math.max(leftHeight + 1, rightHeight + 1);
    }
}
