package BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal_BT {

    public static void levelOrder(BinaryTreeClass.TreeNode root){
        Queue<BinaryTreeClass.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            BinaryTreeClass.TreeNode removedNode = queue.remove();
            if(removedNode == null){
                if(queue.isEmpty()){
                    break;
                }
                else {
                    System.out.println();
                    queue.add(null);
                }
            }
            else{
                System.out.print(removedNode.val + " ");
                if(removedNode.left != null)
                    queue.add(removedNode.left);
                if(removedNode.right != null)
                    queue.add(removedNode.right);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 2 , -1, -1, 1, 2, 6,-1, -1, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        levelOrder(root);


    }
}
