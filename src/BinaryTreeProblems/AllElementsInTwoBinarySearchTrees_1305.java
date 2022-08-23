package BinaryTreeProblems;

import java.util.*;

public class AllElementsInTwoBinarySearchTrees_1305 {
    static List<Integer> list;
    public static List<Integer> getAllElements(BinaryTreeClass.TreeNode root1, BinaryTreeClass.TreeNode root2){
        List<Integer> list1 = inOrderTraversal(root1);
        List<Integer> list2 = inOrderTraversal(root2);
        List<Integer> returnList = new LinkedList<>();
        int idx1 = 0, idx2 = 0;
        while (idx1 < list1.size() && idx2 < list2.size()){
            if(list1.get(idx1) < list2.get(idx2)){
                returnList.add(list1.get(idx1++));
            }
            else {
                returnList.add(list2.get(idx2++));
            }
        }
        return returnList;
    }

    public static List<Integer> inOrderTraversal(BinaryTreeClass.TreeNode root){
            if(root == null){
                return null;
            }
            inOrderTraversal(root.left);
            list.add(root.val);
            inOrderTraversal(root.right);

            return list;
    }
    public static void main(String[] args) {
        // 1st Tree
        //        4
        //      8    5
        //    0   1    6
        int[] nums = {4, 8, 0, -1, -1, 1, -1, -1, 5, -1, 6, -1, -1};

        // 2nd Tree
        //        6
        //      1    5
        //         3
        //       2
        int[] nums2 = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};

        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums2);

        int[] nums3 = {6, 1, -1, -1, 5, 3, 2, -1, -1, -1, -1};

        BinaryTreeClass tree2 = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root2 = tree2.buildTree(nums3);
        System.out.println(getAllElements(root, root2));
    }
}
