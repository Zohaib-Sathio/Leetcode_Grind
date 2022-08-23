package BTSolvedQuestions;

import java.util.HashMap;

public class ConstructBinaryTreeFromPreAndPostOrder_889 {

    /*
    Runtime: 3 ms, faster than 35.04% of Java online submissions for Construct Binary Tree from Preorder and Postorder Traversal.
Memory Usage: 44.1 MB, less than 33.12% of Java online submissions for Construct Binary Tree from Preorder and Postorder Traversal.
     */
        int prePostIndex = 0;
        public BinaryTreeClass.TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
            HashMap<Integer, Integer> map = new HashMap();
            for(int i = 0; i < postorder.length; i++){
                map.put(postorder[i], i);
            }
            return constructTree(preorder, postorder, map, 0, postorder.length - 1);
        }

        public BinaryTreeClass.TreeNode constructTree(int[] preorder, int[] postorder, HashMap<Integer, Integer> map,
                                                      int start, int end){
            if(start > end)
                return null;

            BinaryTreeClass.TreeNode root = new BinaryTreeClass.TreeNode(preorder[prePostIndex++]);

            if(start == end){
                return root;
            }

            int index = map.get(preorder[prePostIndex]);

            root.left = constructTree(preorder, postorder, map, start, index);
            root.right = constructTree(preorder, postorder, map, index + 1, end - 1);

            return root;

        }
    public static void main(String[] args) {

    }
}
