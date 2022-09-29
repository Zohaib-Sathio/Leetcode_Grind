package Resubmitted_Problems;

public class RootEqualsSumOfChildren_2236 {

    /*
    Runtime: 1 ms, faster than 79.17% of Java online submissions for Root Equals Sum of Children.
Memory Usage: 42.1 MB, less than 20.46% of Java online submissions for Root Equals Sum of Children.
     */
    public boolean checkTree(BinaryTreeClass.TreeNode root) {
        if(root == null){
            return true;
        }
        int sum = root.left.val + root.right.val;
        return (root.val == sum);
    }
}
