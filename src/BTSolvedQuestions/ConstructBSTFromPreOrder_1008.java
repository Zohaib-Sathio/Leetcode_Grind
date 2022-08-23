package BTSolvedQuestions;

public class ConstructBSTFromPreOrder_1008 {

     /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
Memory Usage: 42 MB, less than 97.33% of Java online submissions for Convert Sorted Array to Binary Search Tree.
     */

    public BinaryTreeClass.TreeNode bstFromPreorder(int[] preorder) {
        return createBST(preorder, 0, preorder.length - 1);
    }

    public BinaryTreeClass.TreeNode createBST(int[] preorder, int start, int end){
        if(start > end){
            return null;
        }
        BinaryTreeClass.TreeNode node = new BinaryTreeClass.TreeNode(preorder[start]);

        int i;
        for(i = start; i <= end; i++){
            if(preorder[i] > node.val){
                break;
            }
        }
        node.left = createBST(preorder, start + 1, i-1);
        node.right = createBST(preorder, i, end);

        return node;
    }
    public static void main(String[] args) {

    }
}
