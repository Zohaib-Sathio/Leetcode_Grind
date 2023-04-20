package Top_Interview_Questions_Leetcode;

public class maximum_depth_of_binary_tree_104 {
    public int maxDepth(BinaryTreeClass.TreeNode root) {
        return findRoot(root, 0);
    }
    public static int findRoot(BinaryTreeClass.TreeNode root, int height){
        if(root == null){
            return height;
        }
        //3
        int left = findRoot(root.left, height+1);
        //
        int right = findRoot(root.right, height+1);

        return Math.max(left, right);
    }
}
