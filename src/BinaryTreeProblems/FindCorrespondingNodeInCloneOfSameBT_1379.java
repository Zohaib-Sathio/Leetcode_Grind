package BinaryTreeProblems;

public class FindCorrespondingNodeInCloneOfSameBT_1379 {
    public static BinaryTreeClass.TreeNode findCorrespondingClone(final BinaryTreeClass.TreeNode original, final BinaryTreeClass.TreeNode cloned,
                                                                  final BinaryTreeClass.TreeNode target){
        if(cloned == target){
            return cloned;
        }
        if(original.left != null && cloned.left != null){
            return findCorrespondingClone(original.left, cloned.left, target);
        }
        if(original.right != null && cloned.right != null){
            return findCorrespondingClone(original.right, cloned.right, target);
        }
        return null;
    }
    public static void main(String[] args) {
        // 1st Tree
        //        4
        //      8    5
        //    0   1    6
        int[] nums = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};

        // 2nd Tree
        //        3
        //      2    7
        //         5
        //       4
        int[] nums2 = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};

        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode cloned = tree.buildTree(nums);
//        BinaryTreeClass.TreeNode target = new BinaryTreeClass.TreeNode(5);
        BinaryTreeClass.TreeNode clonedNode = findCorrespondingClone(cloned, cloned, cloned.left.right);
        System.out.println(clonedNode);
    }
}
