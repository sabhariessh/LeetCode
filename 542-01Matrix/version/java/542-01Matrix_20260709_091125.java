// Last updated: 09/07/2026, 09:11:25
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n= prices.length;
4        int maxprofit=0;
5        int pbuy=prices[0];
6        for(int i=1;i<n;i++){
7            if(prices[i]<pbuy ){ 
8                pbuy=prices[i];
9            }
10            else if(prices[i]-pbuy>maxprofit){
11                maxprofit=prices[i]-pbuy;
12            }
13        }
14        return maxprofit;
15    }
16}