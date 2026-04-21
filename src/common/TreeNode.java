package common;

/**
 * @BelongsProject: MyLeetCode
 * @BelongsPackage: leetcode
 * @Author: 杨思远
 * @CreateTime: 2026-04-22  01:45
 * @Description: 二叉树节点
 * @Version: 1.0
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}