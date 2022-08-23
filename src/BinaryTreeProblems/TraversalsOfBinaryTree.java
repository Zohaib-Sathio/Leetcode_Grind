package BinaryTreeProblems;

import java.util.LinkedList;
import java.util.List;

public class TraversalsOfBinaryTree {

    static List<Integer> nodes = new LinkedList<>();
    public static List<Integer> preOrderTraversal(BinaryTreeClass.TreeNode root){
        if(root == null){
            return nodes;
        }
        nodes.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

        return nodes;
    }

    public static List<Integer> inOrderTraversal(BinaryTreeClass.TreeNode root){
        if(root == null){
            return null;
        }
        inOrderTraversal(root.left);
        nodes.add(root.val);
        inOrderTraversal(root.right);

        return nodes;
    }
    public static List<Integer> postOrderTraversal(BinaryTreeClass.TreeNode root){
        if(root == null){
            return null;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        nodes.add(root.val);

        return nodes;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 2 , -1, -1, 4, 2, 1,-1, -1, -1, -1};
        int[] nums = {-1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);

        System.out.println(preOrderTraversal(root));

    }
}
