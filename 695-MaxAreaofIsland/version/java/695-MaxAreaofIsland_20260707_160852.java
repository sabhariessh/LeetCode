// Last updated: 07/07/2026, 16:08:52
1class Solution {
2    public int dfs(int[][] grid,int[] start,boolean[][]  visit){
3        int i=start[0];
4        int j=start[1];
5        int area=1;
6        visit[i][j]=true;
7        int[][] child={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
8        for(int k=0;k<4;k++){
9            i=child[k][0];
10            j=child[k][1];
11            if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && !visit[i][j] && grid[i][j]==1){
12                area+=dfs(grid,new int[]{i,j},visit);
13            }
14        }
15        return area;
16    }
17    public int maxAreaOfIsland(int[][] grid) {
18        int n=grid.length;
19        int m=grid[0].length;
20        boolean[][] visit=new boolean[n][m];
21        int ans=0;
22        for(int i=0;i<n;i++){
23            for(int j=0;j<m;j++){
24                if(!visit[i][j] && grid[i][j]==1){
25                    int newans=dfs(grid,new int[]{i,j},visit);
26                    ans=Math.max(ans,newans);
27                }
28            }
29        }
30        return ans;
31    }
32}