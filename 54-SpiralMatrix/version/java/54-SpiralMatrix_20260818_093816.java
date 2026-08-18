// Last updated: 18/08/2026, 09:38:16
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> res=new ArrayList<>();
4        if(matrix==null || matrix.length==0){
5            return res;
6        }
7        int top=0;
8        int bottom=matrix.length-1;
9        int left=0;
10        int right=matrix[0].length-1;
11        while(top <= bottom && left <= right){
12            for(int j=left;j<=right;j++){
13                res.add(matrix[top][j]);
14            }
15            top++;
16            for(int i=top;i<=bottom;i++){
17                res.add(matrix[i][right]);
18            }
19            right--;
20            if(top<=bottom){
21                for(int j=right;j>=left;j--){
22                    res.add(matrix[bottom][j]);
23                }
24                bottom--;
25            }
26            if(left<=right){
27                for(int i=bottom;i>=top;i--){
28                    res.add(matrix[i][left]);
29                }
30                left++;
31            }
32        }
33        return res;
34    }
35}