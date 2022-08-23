package BTSolvedQuestions;

public class ConvertSortedArrayToBST_108 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
Memory Usage: 42 MB, less than 97.33% of Java online submissions for Convert Sorted Array to Binary Search Tree.
     */

    public static BinaryTreeClass.TreeNode createBST(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        BinaryTreeClass.TreeNode node = new BinaryTreeClass.TreeNode(nums[mid]);

        node.left = createBST(nums, start, mid - 1);
        node.right = createBST(nums, mid + 1, end);

        return node;
    }

    public BinaryTreeClass.TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

    }
}
