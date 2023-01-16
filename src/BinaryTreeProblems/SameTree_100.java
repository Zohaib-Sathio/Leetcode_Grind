package BinaryTreeProblems;

public class SameTree_100 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40 MB
Beats
70.44%
     */
    public boolean isSameTree(BinaryTreeClass.TreeNode p, BinaryTreeClass.TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
