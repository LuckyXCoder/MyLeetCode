package leetcode.problems.lc0257_binary_tree_paths;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;


class Solution_1 {

    List<String> resList = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return resList;
        printTreePaths(root, new StringBuilder());
        return resList;
    }

    private void printTreePaths(TreeNode root, StringBuilder currentPath) {
        int l = currentPath.length();
        if (l > 0) {
            currentPath.append("->");
        }
        currentPath.append(root.val);
        if (root.left == null && root.right == null) {
            resList.add(currentPath.toString());
        }
        if (root.left != null) {
            printTreePaths(root.left, currentPath);
        }
        if (root.right != null) {
            printTreePaths(root.right, currentPath);
        }
        currentPath.setLength(l);
    }
}