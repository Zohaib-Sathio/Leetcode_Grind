package LeetcodeFirstMonth;

/*
Runtime: 1 ms, faster than 76.64% of Java online submissions for Root Equals Sum of Children.
Memory Usage: 41.9 MB, less than 42.46% of Java online submissions for Root Equals Sum of Children.
 */

public class RootEqualsSumOfChildren_2236 {
        public static boolean checkTree(TreeNode root) {
            return (root.val == root.left.val + root.right.val);
        }

        public static void main(String[] args) {
            TreeNode tree = new TreeNode(10);
            tree.left = new TreeNode(4);
            tree.right = new TreeNode(6);
            System.out.println(checkTree(tree));

        }
    }
