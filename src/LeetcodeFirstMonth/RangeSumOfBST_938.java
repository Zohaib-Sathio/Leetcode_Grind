package LeetcodeFirstMonth;


import BinaryTreeProblems.BinaryTreeClass;

public class RangeSumOfBST_938 {
    /*
    Runtime: 1 ms, faster than 62.76% of Java online submissions for Range Sum of BST.
Memory Usage: 64.8 MB, less than 77.99% of Java online submissions for Range Sum of BST.
     */

    public static int rangeSumOfBST(BinaryTreeProblems.BinaryTreeClass.TreeNode root, int low, int high){
        return helper(root, low, high, 0);
    }
    public static int helper(BinaryTreeProblems.BinaryTreeClass.TreeNode root, int low, int high, int rangeSum){
        if(low <= root.val && root.val <= high){
            rangeSum += root.val;
        }
        if(root.left != null){
            rangeSum = helper(root.left, low, high, rangeSum);
        }
        if(root.right != null){
            rangeSum = helper(root.right, low, high, rangeSum);
        }
        return rangeSum;
    }
    public static void main(String[] args) {
        // 1st Tree
        //        4
        //      8    5
        //    0   1    6
        int[] nums = {4, 8, 0, -1, -1, 1, -1, -1, 5, -1, 6, -1, -1};

        // 2nd Tree
        //        3
        //      2    7
        //         5
        //       4
        int[] nums2 = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};

        BinaryTreeProblems.BinaryTreeClass tree = new BinaryTreeProblems.BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums2);
        System.out.println(rangeSumOfBST(root, 1, 7));
    }
}
