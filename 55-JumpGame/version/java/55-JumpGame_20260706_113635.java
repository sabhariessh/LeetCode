// Last updated: 06/07/2026, 11:36:35
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n=nums.length;
4        boolean[] dp=new boolean[n];
5        dp[0]=true;
6        for(int i=0;i<n;i++){
7            if(!dp[i]){
8                continue;
9            }
10            for(int j=1;j<=nums[i];j++){
11                int end=j+i;
12                if(end<n){
13                    dp[end]=true;
14                }
15            }
16        }
17        return dp[n-1];
18    }
19}