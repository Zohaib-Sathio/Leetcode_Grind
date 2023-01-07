package BTSolvedQuestions;

public class FindCorrespondingNodeofaBinaryTreeinaCloneofThatTree_1379 {
    /*
    Runtime
2 ms
Beats
83.27%
Memory
50.2 MB
Beats
68.23%
     */
    static BinaryTreeClass.TreeNode ans, target;
    public final BinaryTreeClass.TreeNode getTargetCopy(final BinaryTreeClass.TreeNode original, final BinaryTreeClass.TreeNode cloned, final BinaryTreeClass.TreeNode target) {
        this.target = target;
        inorder(original, cloned);
        return ans;
    }
    private static void inorder(BinaryTreeClass.TreeNode o, BinaryTreeClass.TreeNode c){
        if(c != null){
            inorder(o.left, c.left);

            if(o.val == target.val){
                ans = c;
            }
            inorder(o.right, c.right); }
    }
}
