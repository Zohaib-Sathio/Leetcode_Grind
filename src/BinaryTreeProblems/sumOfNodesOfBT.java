package BinaryTreeProblems;

public class sumOfNodesOfBT {
    static int size = 0;
    public static int sumOfNodes(BinaryTreeClass.TreeNode root){
        if(root == null){
            return 0;
        }
        size++;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.val;
    }

    public static void main(String[] args) {
        //        3
        //      2    7
        //         5
        //       4
        int[] nums = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};
//        int[] nums = {3, 2 , -1, -1, 1, 2, 1,-1, -1, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        int sumOfNodes = sumOfNodes(root);
        System.out.println(sumOfNodes);

    }
}
