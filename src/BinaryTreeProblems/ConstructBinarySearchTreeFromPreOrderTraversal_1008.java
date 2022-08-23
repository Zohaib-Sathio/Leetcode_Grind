package BinaryTreeProblems;

public class ConstructBinarySearchTreeFromPreOrderTraversal_1008 {
    public static BinaryTreeClass.TreeNode buildBSTFromPreOrder(int[] preOrder){
        return helper(preOrder, 0);
    }
    public static BinaryTreeClass.TreeNode helper(int[] preOrder, int index){
        /*
        8
        5
        1 7
        7 10
        10 12
        12
         */

        BinaryTreeClass.TreeNode node = new BinaryTreeClass.TreeNode(preOrder[index]);
        if(index == preOrder.length - 1){
            return node;
        }
        if(preOrder[index + 1] < preOrder[index]){
            node.left = helper(preOrder, ++index);
        }
        if(preOrder[index + 1] > preOrder[index]){
            node.right = helper(preOrder, ++index);
        }

        return node;
    }
    public static void main(String[] args) {
        int[] nums = {8, 5, 1, 7, 10, 12};
        BinaryTreeClass.TreeNode newBST = buildBSTFromPreOrder(nums);
        BinaryTreeClass tree = new BinaryTreeClass();
        tree.printTree(newBST);
    }
}
