// Last updated: 07/07/2026, 16:14:27
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5        int maxArea = 0;
6        int[][] directions = {
7            {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                if (grid[i][j] == 1) {
11                    int area = 0;
12                    Queue<int[]> queue = new LinkedList<>();
13                    queue.offer(new int[]{i, j});
14                    grid[i][j] = 0;
15                    while (!queue.isEmpty()) {
16                        int[] cell = queue.poll();
17                        area++;
18                        for (int[] dir : directions) {
19                            int newRow = cell[0] + dir[0];
20                            int newCol = cell[1] + dir[1];
21                            if (newRow >= 0 && newRow < rows &&
22                                newCol >= 0 && newCol < cols &&
23                                grid[newRow][newCol] == 1) {
24                                queue.offer(new int[]{newRow, newCol});
25                                grid[newRow][newCol] = 0; 
26                            }
27                        }
28                    }
29                    maxArea = Math.max(maxArea, area);
30                }
31            }
32        }
33        return maxArea;
34    }
35}