package Top_Interview_Questions_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class binary_tree_inorder_traversal_94 {
    public List<Integer> inorderTraversal(BinaryTreeClass.TreeNode root) {
        List<Integer> list = new LinkedList();
        inorder(list, root);
        return list;
    }
    public static void inorder(List<Integer> list, BinaryTreeClass.TreeNode root){
        if(root == null){
            return;
        }
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }
}
