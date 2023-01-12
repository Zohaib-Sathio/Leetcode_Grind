package BinaryTreeProblems;

public class SymmetricTree_101 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.8 MB
Beats
61.29%
     */
    public boolean isSymmetric(BinaryTreeClass.TreeNode root) {
        BinaryTreeClass.TreeNode root2 = root;
        return sym(root, root2);
    }
    private static boolean sym(BinaryTreeClass.TreeNode p, BinaryTreeClass.TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        return sym(p.left, q.right) && sym(p.right, q.left);
    }
}
