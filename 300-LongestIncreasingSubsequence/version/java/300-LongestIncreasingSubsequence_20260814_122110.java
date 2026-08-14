// Last updated: 14/08/2026, 12:21:10
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        int max = 1;
6        for (int i = 0; i < n; i++) {
7            dp[i] = 1;
8        }
9        for (int i = 1; i < n; i++) {
10            for (int j = 0; j < i; j++) {
11                if (nums[i] > nums[j]) {
12                    dp[i] = Math.max(dp[i], dp[j] + 1);
13                }
14            }
15            max = Math.max(max, dp[i]);
16        }
17        return max;
18    }
19}