// Last updated: 06/07/2026, 14:02:29
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        dp[0] = nums[0];
6        int ans = dp[0];
7        for (int i = 1; i < n; i++) {
8            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
9            ans = Math.max(ans, dp[i]);
10        }
11        return ans;
12    }
13}