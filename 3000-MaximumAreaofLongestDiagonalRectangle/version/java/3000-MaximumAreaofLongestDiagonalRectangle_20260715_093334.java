// Last updated: 15/07/2026, 09:33:34
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3        int[][] ans=new int[matrix.length][matrix[0].length];
4        for(int i=0;i<matrix[0].length;i++){
5            int max=0;
6            for(int j=0;j<matrix.length;j++){
7                max=Math.max(max,matrix[j][i]);
8            }
9            for(int j=0;j<matrix.length;j++){
10                if(matrix[j][i]==-1){
11                    ans[j][i]=max;
12                }
13                else{
14                    ans[j][i]=matrix[j][i];
15                }
16            }
17        }
18        return ans;
19    }
20}