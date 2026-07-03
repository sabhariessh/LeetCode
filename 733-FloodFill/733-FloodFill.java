// Last updated: 03/07/2026, 11:38:46
class Solution {
    public void dfs(int[][] grid,int[] start,int prevcolour,int newcolour,boolean[][]  visit){
        int i=start[0];
        int j=start[1];
        visit[i][j]=true;
        grid[i][j]=newcolour;
        int[][] child={{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && !visit[i][j] && grid[i][j]==prevcolour){
                dfs(grid,new int[]{i,j},prevcolour,newcolour,visit);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int colour) {
        int n=image.length;
        int m=image[0].length;
        boolean[][] visit=new boolean[n][m];
        dfs(image,new int[]{sr,sc},image[sr][sc],colour,visit);
        return image;
    }
}