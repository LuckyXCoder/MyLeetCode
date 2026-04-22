package leetcode.problems.lc0113_path_sum_ii;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    private static final List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return res;
        dfs(root, targetSum, new ArrayList<>());
        return res;
    }

    private static void dfs(TreeNode root, int targetSum, List<Integer> list) {
        list.add(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            res.add(new ArrayList<>(list));
        }
        if (root.left != null) {
            dfs(root.left, targetSum, list);
        }
        if (root.right != null) {
            dfs(root.right, targetSum, list);
        }
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
//        [5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null);
        root.right = new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)));
        System.out.println(pathSum(root, 22));
    }

}