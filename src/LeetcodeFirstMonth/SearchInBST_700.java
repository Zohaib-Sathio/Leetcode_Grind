package LeetcodeFirstMonth;

import BinaryTreeProblems.BinaryTreeClass;

public class SearchInBST_700 {

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
Memory Usage: 50.9 MB, less than 81.50% of Java online submissions for Search in a Binary Search Tree.
     */

    public static BinaryTreeProblems.BinaryTreeClass.TreeNode searchInBST(BinaryTreeProblems.BinaryTreeClass.TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(root.val < val){
            return searchInBST(root.right, val);
        }
        else {
            return searchInBST(root.left, val);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2 , -1, -1, 7, 5, 4,-1, -1, -1, -1};
        BinaryTreeProblems.BinaryTreeClass tree = new BinaryTreeProblems.BinaryTreeClass();
        BinaryTreeProblems.BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        BinaryTreeClass.TreeNode subTree = searchInBST(root, 9);
        tree.printTree(subTree);
    }
}
