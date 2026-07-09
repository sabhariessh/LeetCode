// Last updated: 09/07/2026, 09:25:23
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n= prices.length;
4        int maxprofit=0;
5        int l=0;
6        int r=1;
7        int ans=0;
8        while(r<n){
9            if(prices[r]>prices[l]){
10                maxprofit=prices[r]-prices[l];
11                ans=Math.max(ans,maxprofit);
12            }
13            else{
14                l=r;
15            }
16            r++;
17        }
18        return ans;
19    }
20}