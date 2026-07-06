// Last updated: 06/07/2026, 14:21:52
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[] aboveRow = new int[n];
4        Arrays.fill(aboveRow, 1);
5        for (int row = 1; row < m; row++) {
6            int[] currentRow = new int[n];
7            Arrays.fill(currentRow, 1);
8            for (int col = 1; col < n; col++) {
9                currentRow[col] = currentRow[col - 1] + aboveRow[col];
10            }
11            aboveRow = currentRow;
12        }
13        return aboveRow[n - 1];
14    }
15}