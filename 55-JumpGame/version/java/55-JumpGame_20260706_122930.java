// Last updated: 06/07/2026, 12:29:30
1class Solution {
2    public int jump(int[] nums) {
3        int n=nums.length;
4        int[] dp=new int[n];
5        Arrays.fill(dp, Integer.MAX_VALUE);
6        dp[n - 1] = 0;
7        for(int i=n-2;i>=0;i--){
8            int min=Integer.MAX_VALUE;
9            for(int j=1;j<=nums[i]&&i+j<n;j++){
10                if(dp[i+j]<min){
11                    min=dp[i+j];
12                }
13            }
14            if(min!=Integer.MAX_VALUE){
15                dp[i]=min+1;
16            }
17        }
18        return dp[0];
19    }
20}