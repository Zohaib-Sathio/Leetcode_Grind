package LeetcodeFirstMonth;


import BinaryTreeProblems.BinaryTreeClass;

public class EvaluateBoolean_BT_2331 {

    /*
    Runtime: 1 ms, faster than 63.76% of Java online submissions for Evaluate Boolean Binary Tree.
Memory Usage: 46.4 MB, less than 67.71% of Java online submissions for Evaluate Boolean Binary Tree.
     */

    public static boolean evaluateBooleanTree(BinaryTreeProblems.BinaryTreeClass.TreeNode root){
        if(root.val == 0){
            return false;
        }
        if(root.val == 1){
            return true;
        }
        if(root.val == 3){
            return (evaluateBooleanTree(root.left) && evaluateBooleanTree(root.right));
        }
        if(root.val == 2){
            return (evaluateBooleanTree(root.left) || evaluateBooleanTree(root.right));
        }
        return false;
    }

    public static void main(String[] args) {
        //        3
        //      1    3
        //         0   1
//        int[] nums = {3, 1, -1, -1, 2, 0, -1, -1, 1, -1, -1};
        int[] nums = {1, -1, -1};
        BinaryTreeProblems.BinaryTreeClass tree = new BinaryTreeProblems.BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        System.out.println(evaluateBooleanTree(root));
    }
}