package BinaryTreeProblems;

public class CountNodesEqualToAverageOfSubTree_2265 {

//    static int size = 0;
//    static int sum = 0;
    static int count = 0;
    public static int averageOfSubTrees(BinaryTreeClass.TreeNode root){
        int average = averageOfRoot(root)/size;
        int rootData = root.val;
        if(average == rootData){
            size = 0;
            count++;
        }
        if(root.left != null){
            averageOfSubTrees(root.left);
        }
        if(root.right != null){
            averageOfSubTrees(root.right);
        }

        return count;
    }
    static int size = 0;

    public static int averageOfRoot(BinaryTreeClass.TreeNode root){
        if(root == null){
            return 0;
        }
        size++;
        int leftSum = averageOfRoot(root.left);
        int rightSum = averageOfRoot(root.right);

        return (leftSum + rightSum + root.val);
    }

    public static void main(String[] args) {
        //        3
        //      2    6
        //         5
        //       4
//        int[] nums = {4, 2, -1, -1, 5, 5, 4, -1, -1, -1, -1};
//        int[] nums = {4, 8, 0, -1, -1, 1, -1, -1 , 5, -1, 6, -1, -1};
        int[] nums = {6, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        System.out.println(averageOfSubTrees(root));

    }
}
