package leetcode.problems.lc0931_minimum_falling_path_sum;

import java.util.Arrays;

class Solution_1 {
    public static int minFallingPathSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return -1;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, m);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentMinPathSum = dp[i - 1][j];
                // 存在左边界
                if (j > 0) currentMinPathSum = Math.min(currentMinPathSum, dp[i - 1][j - 1]);
                // 存在右边界
                if (j < n - 1) currentMinPathSum = Math.min(currentMinPathSum, dp[i - 1][j + 1]);
                dp[i][j] = matrix[i][j] + currentMinPathSum;
            }
        }
        int res = dp[m - 1][0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, dp[m - 1][i]);
        }
        return res;
    }

    public static int minFallingPathSum2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return -1;
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 1 && n == 1) return matrix[0][0];
        int[][] dp = new int[2][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, m);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentMinPathSum = dp[0][j];
                // 存在左边界
                if (j > 0) currentMinPathSum = Math.min(currentMinPathSum, dp[0][j - 1]);
                // 存在右边界
                if (j < n - 1) currentMinPathSum = Math.min(currentMinPathSum, dp[0][j + 1]);
                dp[1][j] = matrix[i][j] + currentMinPathSum;
            }
            System.arraycopy(dp[1], 0, dp[0], 0, n);
        }
        int res = dp[1][0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, dp[1][i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
//        int[][] ints = {{17, 82}, {1, -44}};
        System.out.println(minFallingPathSum(ints));
        System.out.println(Arrays.deepToString(ints));
    }

}