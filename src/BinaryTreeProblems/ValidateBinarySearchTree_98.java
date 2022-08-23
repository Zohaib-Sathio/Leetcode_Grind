package BinaryTreeProblems;

public class ValidateBinarySearchTree_98 {
    // Not getting solution!
    public static boolean isBST(BinaryTreeClass.TreeNode root){
        if(root == null){
            return true;
        }
        boolean left, right;

        left = isBST(root.left);

        right = isBST(root.right);

        if(root.left != null){
            if(root.left.val > root.val){
                return false;
            }
        }
        if(root.right != null){
            if(root.right.val < root.val){
                return false;
            }
        }

        return (left || right);
    }

//    public static boolean isBST(BinaryTreeClass.TreeNode root){
//        if(root.left == null && root.right == null){
//            return true;
//        }
//
//    }

    public static void main(String[] args) {
        // 1st Tree
        //        4
        //      8    5
        //    0   1    6
        int[] nums = {4, 8, 0, -1, -1, 1, -1, -1, 5, -1, 6, -1, -1};

        // 2nd Tree
        //        3
        //      2    7
        //         5
        //       4
        int[] nums2 = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};

        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums2);
        System.out.println(isBST(root));
    }
}
