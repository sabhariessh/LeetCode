// Last updated: 07/07/2026, 16:27:32
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int maxArea = 0;
4        for (int i = 0; i < grid.length; i++) {
5            for (int j = 0; j < grid[0].length; j++) {
6                if (grid[i][j] == 1) {
7                    int area=bfs(grid,i,j);
8                    maxArea = Math.max(maxArea,area);
9                }
10            }
11        }
12        return maxArea;
13    }
14    public int bfs(int[][] grid, int row, int col) {
15        Queue<int[]> queue = new LinkedList<>();
16        queue.add(new int[]{row, col});
17        grid[row][col] = 0; 
18        int area = 0;
19        int[] dr = {-1, 1, 0, 0};
20        int[] dc = {0, 0, -1, 1};
21        while (queue.size()>0) {
22            int[] current = queue.remove();
23            area++;
24            int r = current[0];
25            int c = current[1];
26            for (int i = 0; i < 4; i++) {
27                int nr = r + dr[i];
28                int nc = c + dc[i];
29                if (nr >= 0 && nr < grid.length &&nc >= 0 && nc < grid[0].length &&       grid[nr][nc] == 1) {
30                    queue.add(new int[]{nr, nc});
31                    grid[nr][nc] = 0; 
32                }
33            }
34        }
35        return area;
36    }
37}