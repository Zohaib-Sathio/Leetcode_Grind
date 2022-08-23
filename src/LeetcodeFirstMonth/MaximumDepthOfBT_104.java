package LeetcodeFirstMonth;

import BinaryTreeProblems.BinaryTreeClass;

public class MaximumDepthOfBT_104 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 43.4 MB, less than 26.66% of Java online submissions for Maximum Depth of Binary Tree.
     */
    public static int maxDepth_BT(BinaryTreeProblems.BinaryTreeClass.TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth_BT(root.left) , maxDepth_BT(root.right)) + 1;
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
//        int[] nums2 = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};
        int[] nums2 = {3, -1, -1};

        BinaryTreeProblems.BinaryTreeClass tree = new BinaryTreeProblems.BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums2);
        System.out.println(maxDepth_BT(root));
    }
}
