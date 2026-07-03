// Last updated: 03/07/2026, 11:38:51
class Solution {
    public int dfs(int[][] grid,int[] start,boolean[][]  visit){
        int i=start[0];
        int j=start[1];
        int area=1;
        visit[i][j]=true;
        int[][] child={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && !visit[i][j] && grid[i][j]==1){
                area+=dfs(grid,new int[]{i,j},visit);
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visit=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visit[i][j] && grid[i][j]==1){
                    int newans=dfs(grid,new int[]{i,j},visit);
                    ans=Math.max(ans,newans);
                }
            }
        }
        return ans;
    }
}