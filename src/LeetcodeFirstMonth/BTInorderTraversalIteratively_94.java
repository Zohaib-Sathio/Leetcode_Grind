package LeetcodeFirstMonth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTInorderTraversalIteratively_94 {
    /*
    Runtime: 1 ms, faster than 49.17% of Java online submissions for Binary Tree Inorder Traversal.
Memory Usage: 43.1 MB, less than 8.90% of Java online submissions for Binary Tree Inorder Traversal.
     */
    public List<Integer> inorderTraversal(BinaryTreeClass.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeClass.TreeNode> stack = new Stack<>();
        BinaryTreeClass.TreeNode node = root;

        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;

        }
        return list;

    }
    public static void main(String[] args) {

    }
}
