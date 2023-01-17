package Resubmitted_Problems;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalOfBT_144 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.9 MB
Beats
58.30%
     */
    public List<Integer> preorderTraversal(BinaryTreeClass.TreeNode root) {
        List<Integer> list = new ArrayList();
        preTree(root, list);
        return list;

    }
    public static void preTree(BinaryTreeClass.TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preTree(root.left, list);
        preTree(root.right, list);
    }
}
