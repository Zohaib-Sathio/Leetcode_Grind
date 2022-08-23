package BinaryTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeClass {
    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }
    public void printTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
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

        static int index = -1;
        public TreeNode buildTree(int[] nums){
            index++;
            if(nums[index] == -1){
                return null;
            }

            TreeNode newNode = new TreeNode(nums[index]);
            newNode.left = buildTree(nums);
            newNode.right = buildTree(nums);

            return newNode;
        }

    public static void main(String[] args) {
        int[] nums = {3, 2 , -1, -1, 4, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        TreeNode root = tree.buildTree(nums);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }
}