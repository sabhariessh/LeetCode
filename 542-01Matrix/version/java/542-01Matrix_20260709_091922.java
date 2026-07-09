// Last updated: 09/07/2026, 09:19:22
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n= prices.length;
4        int maxprofit=0;
5        int buy=prices[0];
6        for(int i=1;i<n;i++){
7            if(prices[i]<buy ){ 
8                buy=prices[i];
9            }
10            maxprofit=Math.max(maxprofit,prices[i]-buy);
11        }
12        return maxprofit;
13    }
14}