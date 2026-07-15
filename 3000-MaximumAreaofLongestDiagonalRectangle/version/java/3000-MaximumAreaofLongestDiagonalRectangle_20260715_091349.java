// Last updated: 15/07/2026, 09:13:49
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        int maxA=0;
4        int maxD=0;
5        int n=dimensions.length;
6        for(int i=0;i<n;i++){
7            int l=dimensions[i][0];
8            int b=dimensions[i][1];
9            int currD=l*l+b*b;
10            int currA=l*b;
11            if(currD>maxD || (currD==maxD&&currA>maxA)){
12                maxD=currD;
13                maxA=currA;
14            }
15        }
16        return maxA;
17    }
18}