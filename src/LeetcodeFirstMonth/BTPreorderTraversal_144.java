package LeetcodeFirstMonth;

import java.util.LinkedList;
import java.util.List;

public class BTPreorderTraversal_144 {

    /*
    Runtime: 1 ms, faster than 50.22% of Java online submissions for Binary Tree Preorder Traversal.
Memory Usage: 42.2 MB, less than 49.18% of Java online submissions for Binary Tree Preorder Traversal.
     */

    public static List<Integer> preorderTraversal(BinaryTreeClass.TreeNode root) {
        List<Integer> nodes = new LinkedList<>();
        if(root == null){
            return nodes;
        }
        nodes.add(root.val);
        nodes.addAll(preorderTraversal(root.left));
        nodes.addAll(preorderTraversal(root.right));

        return nodes;
    }
    public static void main(String[] args) {

    }
}
