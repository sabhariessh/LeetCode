// Last updated: 15/07/2026, 12:03:23
class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                ans+=prices[i]-prices[i-1];
            }
        }
        return ans;
    }
}