// Last updated: 08/07/2026, 16:08:26
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        for (int i = 0; i < m; i++) {
6            for (int j = 0; j < n; j++) {
7                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && grid[i][j] == 1) {
8                    dfs(grid, i, j);
9                }
10            }
11        }
12        int count = 0;
13        for (int i = 0; i < m; i++) {
14            for (int j = 0; j < n; j++) {
15                if (grid[i][j] == 1) {
16                    count++;
17                }
18            }
19        }
20        return count;
21    }
22    private void dfs(int[][] grid, int i, int j) {
23        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
24            return ;
25        } 
26        grid[i][j] = 0;
27        dfs(grid,i+1,j);
28        dfs(grid,i,j+1);
29        dfs(grid,i-1,j);
30        dfs(grid,i,j-1);
31        // int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
32        // for (int[] direction : directions) {
33        //     int x = i + direction[0];
34        //     int y = j + direction[1];
35        //     if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
36        //         dfs(grid, x, y);
37        //     }
38        // }
39    }
40}