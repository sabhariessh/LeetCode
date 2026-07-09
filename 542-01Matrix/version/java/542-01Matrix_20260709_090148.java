// Last updated: 09/07/2026, 09:01:48
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int rows = mat.length;
4        int cols = mat[0].length;
5        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
6        Queue<int[]> queue = new ArrayDeque<>();
7        for (int i = 0; i < rows; i++) {
8            for (int j = 0; j < cols; j++) {
9                if (mat[i][j] == 0) {
10                    queue.add(new int[]{i, j});
11                } else {
12                    mat[i][j] = Integer.MAX_VALUE;
13                }
14            }
15        }
16        while (!queue.isEmpty()) {
17            int[] cell = queue.poll();
18            int row = cell[0];
19            int col = cell[1];
20            for (int[] direction : directions) {
21                int newRow = row + direction[0];
22                int newCol = col + direction[1];
23                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && mat[newRow][newCol] > mat[row][col] + 1) {
24                    mat[newRow][newCol] = mat[row][col] + 1;
25                    queue.add(new int[]{newRow, newCol});
26                }
27            }
28        }
29        return mat;        
30    }
31}