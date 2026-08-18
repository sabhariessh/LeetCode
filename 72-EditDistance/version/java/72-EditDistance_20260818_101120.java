// Last updated: 18/08/2026, 10:11:20
1class Solution {
2  public int minDistance(String word1, String word2) {
3    final int m = word1.length();
4    final int n = word2.length();
5    int[][] dp = new int[m + 1][n + 1];
6    for (int i = 1; i <= m; ++i)
7      dp[i][0] = i;
8    for (int j = 1; j <= n; ++j)
9      dp[0][j] = j;
10    for (int i = 1; i <= m; ++i)
11      for (int j = 1; j <= n; ++j)
12        if (word1.charAt(i - 1) == word2.charAt(j - 1))
13          dp[i][j] = dp[i - 1][j - 1];
14        else
15          dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
16    return dp[m][n];
17  }
18}