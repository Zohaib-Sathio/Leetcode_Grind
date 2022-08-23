package LeetcodeFirstMonth;

import BinaryTreeProblems.BinaryTreeClass;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum_1302 {

    /*
    Runtime: 9 ms, faster than 38.90% of Java online submissions for Deepest Leaves Sum.
Memory Usage: 59.9 MB, less than 20.63% of Java online submissions for Deepest Leaves Sum.
     */

    public static int deepestLeavesSum(BinaryTreeProblems.BinaryTreeClass.TreeNode root){
        int sumOfDeepLeaves = 0;
        Queue<BinaryTreeProblems.BinaryTreeClass.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            BinaryTreeProblems.BinaryTreeClass.TreeNode removedNode = queue.remove();
            if(removedNode == null){
                if(queue.isEmpty()){
                    break;
                }
                else {
                    sumOfDeepLeaves = 0;
                    queue.add(null);
                }
            }
            else{
                sumOfDeepLeaves += removedNode.val;
                if(removedNode.left != null){
                    queue.add(removedNode.left);
                }
                if(removedNode.right != null){
                    queue.add(removedNode.right);
                }
            }
        }
        return sumOfDeepLeaves;
    }

    public static void main(String[] args) {
        //        3
        //      2    7
        //         5
        //       4   6
        int[] nums = {3, 2, -1, -1, 7, 5, 4, -1, -1, 6, -1, -1, -1};
        BinaryTreeProblems.BinaryTreeClass tree = new BinaryTreeProblems.BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        System.out.println(deepestLeavesSum(root));
    }
}
