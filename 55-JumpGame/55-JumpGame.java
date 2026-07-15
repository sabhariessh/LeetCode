// Last updated: 15/07/2026, 12:03:46
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] dp=new boolean[n];
        dp[0]=true;
        for(int i=0;i<n;i++){
            if(!dp[i]){
                continue;
            }
            for(int j=1;j<=nums[i];j++){
                int end=j+i;
                if(end<n){
                    dp[end]=true;
                }
            }
        }
        return dp[n-1];
    }
}