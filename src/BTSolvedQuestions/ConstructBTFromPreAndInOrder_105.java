package BTSolvedQuestions;

public class ConstructBTFromPreAndInOrder_105 {

    /*
    Runtime: 5 ms, faster than 39.34% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
Memory Usage: 43.9 MB, less than 79.81% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
     */
    public BinaryTreeClass.TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, preorder.length - 1, preorder, inorder);
    }
    public BinaryTreeClass.TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        BinaryTreeClass.TreeNode root = new BinaryTreeClass.TreeNode(preorder[preStart]);
        int inIndex = 0; // Index of current root in inorder
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }
        root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
    public static void main(String[] args) {

    }
}
