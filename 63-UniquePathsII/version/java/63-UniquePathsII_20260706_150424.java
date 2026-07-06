// Last updated: 06/07/2026, 15:04:24
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5        if (obstacleGrid[0][0] == 1)
6            return 0;
7        int[][] dp = new int[m][n];
8        dp[0][0] = 1;
9        for (int i = 1; i < m; i++) {
10            if (obstacleGrid[i][0] == 0)
11                dp[i][0] = dp[i - 1][0];
12        }
13        for (int j = 1; j < n; j++) {
14            if (obstacleGrid[0][j] == 0)
15                dp[0][j] = dp[0][j - 1];
16        }
17        for (int i = 1; i < m; i++) {
18            for (int j = 1; j < n; j++) {
19                if (obstacleGrid[i][j] == 1) {
20                    dp[i][j] = 0;
21                } else {
22                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
23                }
24            }
25        }
26        return dp[m - 1][n - 1];
27    }
28}