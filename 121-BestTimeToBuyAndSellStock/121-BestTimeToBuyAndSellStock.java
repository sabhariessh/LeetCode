// Last updated: 15/07/2026, 12:03:24
class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int maxprofit=0;
        int l=0;
        int r=1;
        int ans=0;
        while(r<n){
            if(prices[r]>prices[l]){
                maxprofit=prices[r]-prices[l];
                ans=Math.max(ans,maxprofit);
            }
            else{
                l=r;
            }
            r++;
        }
        return ans;
    }
}