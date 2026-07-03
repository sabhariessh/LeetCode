// Last updated: 03/07/2026, 11:38:32
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1){
            return -1;
        }
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visit=new boolean[n][m];
        q.add(new int[]{0,0});
        int level=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int u=0;u<s;u++){
                int i=q.peek()[0];
                int j=q.peek()[1];
                if(i==n-1 && j==n-1){
                    return level+1;
                }
                q.poll();
                int[][] child={{i+1,j},{i-1,j},{i,j+1},{i,j-1},{i+1,j+1},{i-1,j-1},{i-1,j+1},{i+1,j-1}};
                for(int k=0;k<8;k++){
                    int ci=child[k][0];
                    int cj=child[k][1];
                    if(ci>=0&&ci<n&&cj>=0&&cj<m&&grid[ci][cj]==0&&!visit[ci][cj]){
                        visit[ci][cj]=true;
                        q.add(new int[]{ci,cj});
                    }
                }
            }
            level++;
        }
        return-1;
    }
}