package BinaryTreeProblems;


public class SumOfNodesWithEvenValuedGrandParent_1315 {

    static BinaryTreeClass.TreeNode grandParent = new BinaryTreeClass.TreeNode(-1);
    static BinaryTreeClass.TreeNode parent = new BinaryTreeClass.TreeNode(-1);
    static int sumOfEvenGP = 0;
    public static int evenValuedGrandParent(BinaryTreeClass.TreeNode root){
        if(grandParent.val % 2 == 0){
            if(root.left != null){
                sumOfEvenGP += root.left.val;
            }
            if(root.right != null){
                sumOfEvenGP += root.right.val;
            }
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        grandParent = root;
        if(root.left != null){
            parent = root.left;
            evenValuedGrandParent(root.left);
        }
        if(root.right != null){
            parent = root.right;
            evenValuedGrandParent(root.right);
        }
        return sumOfEvenGP;
    }

    public static void main(String[] args) {
        //        4
        //      8    5
        //    0   1    6
//        int[] nums = {4, 8, 0, -1, -1, 1, -1, -1, 5, -1, 6, -1, -1};
        int[] nums = {4, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        System.out.println(evenValuedGrandParent(root));
    }
}
