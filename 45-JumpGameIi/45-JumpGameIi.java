// Last updated: 15/07/2026, 12:03:52
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=nums[i]&&i+j<n;j++){
                if(dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }
        }
        return dp[0];
    }
}