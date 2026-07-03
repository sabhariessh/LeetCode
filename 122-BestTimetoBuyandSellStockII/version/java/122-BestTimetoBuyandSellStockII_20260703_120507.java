// Last updated: 03/07/2026, 12:05:07
1class Solution {
2    public int maxProfit(int[] prices) {
3        int ans=0;
4        int n=prices.length;
5        for(int i=1;i<n;i++){
6            if(prices[i]>prices[i-1]){
7                ans+=prices[i]-prices[i-1];
8            }
9        }
10        return ans;
11    }
12}