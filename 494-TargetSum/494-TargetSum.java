// Last updated: 03/07/2026, 11:39:08
class Solution {
    static int subSetDp(int[] arr,int sum,int n,int[][] dp){
        if(n==0){
            if(sum==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[n][sum]==-1){
            if(arr[n-1]<=sum){
                dp[n][sum]=subSetDp(arr,sum-arr[n-1],n-1,dp) + subSetDp(arr,sum,n-1,dp);
            }
            else{
                dp[n][sum]=subSetDp(arr,sum,n-1,dp);
            }
        }
        else{
            return dp[n][sum];
        }
        return dp[n][sum];
    }
    public int findTargetSumWays(int[] arr, int d) {
        d=Math.abs(d);
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if((sum+d)%2!=0){
            return 0;
        }
        int target=(sum+d)/2;
        int[][] dp= new int[arr.length+1][target+1];
        for(int i=0;i<arr.length+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return subSetDp(arr,target,arr.length,dp);
    }
}