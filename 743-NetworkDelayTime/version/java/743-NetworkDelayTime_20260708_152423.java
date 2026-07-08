// Last updated: 08/07/2026, 15:24:23
1class Solution {
2    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
3        int r=grid.length;
4        int c=grid[0].length;
5        boolean[][] vis=new boolean[r][c];
6        dfs(grid,row,col,vis,color,grid[row][col]);
7        return grid;
8    }
9    public void dfs(int[][] grid, int r, int c,boolean[][] vis, int color,int old){
10        vis[r][c]=true;
11        int cnt=0;
12        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
13        for(int i=0;i<4;i++){
14            int nr=r+dir[i][0];
15            int nc=c+dir[i][1];
16            if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&(grid[nr][nc]==old || vis[nr][nc])){
17                cnt++;
18                if(!vis[nr][nc]){
19                    dfs(grid,nr,nc,vis,color,old);
20                }
21            }
22        }
23        if(cnt<4){
24            grid[r][c]=color;
25        }
26    }
27}