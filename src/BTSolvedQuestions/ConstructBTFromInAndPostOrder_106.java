package BTSolvedQuestions;

public class ConstructBTFromInAndPostOrder_106 {
    /*
    Runtime: 3 ms, faster than 87.50% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
Memory Usage: 41.6 MB, less than 99.81% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
     */

    public BinaryTreeClass.TreeNode buildTree(int[] inorder, int[] postorder) {
        return constructBT(inorder, inorder.length - 1, 0, postorder, postorder.length - 1);
    }

    public BinaryTreeClass.TreeNode constructBT(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart){
        if(inStart < inEnd || postStart < 0){
            return null;
        }

        BinaryTreeClass.TreeNode root = new BinaryTreeClass.TreeNode(postorder[postStart]);

        int inIndex = postStart;
        for(int i = inStart; i >= inEnd; i--){
            if(inorder[i] == postorder[postStart]){
                inIndex = i;
                break;
            }
        }

        root.right = constructBT(inorder,  inStart, inIndex + 1, postorder, postStart -1);
        root.left = constructBT(inorder, inIndex - 1, inEnd,  postorder, postStart - (inStart - inIndex) - 1);


        return root;
    }
    public static void main(String[] args) {

    }
}
