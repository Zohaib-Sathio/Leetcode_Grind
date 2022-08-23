package BinaryTreeProblems;

public class sumOfLeafNodes_BT {
    static int sum = 0;
    public static int sumOfLeafNodes(BinaryTreeClass.TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            sum += root.val;
        }
        sumOfLeafNodes(root.left);
        sumOfLeafNodes(root.right);

        return sum;
    }

    //        3
    //      2    7
    //         5
    //       4
    public static void main(String[] args) {
        int[] nums = {3, 2 , -1, -1, 7, 5, 4,-1, -1, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        int sumOfNodes = sumOfLeafNodes(root);
        System.out.println(sumOfNodes);

    }
}
