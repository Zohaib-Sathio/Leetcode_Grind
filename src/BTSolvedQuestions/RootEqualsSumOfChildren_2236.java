package BTSolvedQuestions;

public class RootEqualsSumOfChildren_2236 {
    /*
    Runtime
0 ms
Beats
100%
Memory
40.1 MB
Beats
77.66%
     */
    public boolean checkTree(BinaryTreeClass.TreeNode root) {
        return (root.left.val + root.right.val == root.val);
    }
}
